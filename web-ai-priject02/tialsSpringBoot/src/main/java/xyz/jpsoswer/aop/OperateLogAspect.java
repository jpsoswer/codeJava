package xyz.jpsoswer.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.jpsoswer.mapper.OperateLogMapper;
import xyz.jpsoswer.pojo.OperateLog;
import xyz.jpsoswer.utils.CurrentHolder;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class OperateLogAspect {
    @Autowired
    private OperateLogMapper operateLogMapper;

    @Around("@annotation(xyz.jpsoswer.anno.Log)")
    public Object logOperation(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();



        //执行目标方法
        Object result = joinPoint.proceed();

        //计算耗时
        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;

        //构建日志实体
        OperateLog olog = new OperateLog();
        olog.setOperateEmpId(getCurrentUserId()); //这里需要你根据实际情况获取当前用户ID
        olog.setOperateTime(LocalDateTime.now());
        olog.setClassName(joinPoint.getTarget().getClass().getName());
        olog.setMethodName(joinPoint.getSignature().getName());
        olog.setMethodParams(Arrays.toString(joinPoint.getArgs()));
        olog.setReturnValue(result != null ? result.toString() : "void");
        olog.setCostTime(costTime);

        //保存日志
        operateLogMapper.insert(olog);
        log.info("记录操作日志:{}",olog);
        return result;
    }


    //返回操作用户Id
    private Integer getCurrentUserId() {
        return CurrentHolder.getCurrentId();
    }
}
