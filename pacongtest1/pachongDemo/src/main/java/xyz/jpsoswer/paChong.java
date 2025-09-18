package xyz.jpsoswer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class paChong {

    public static void main(String[] args) {
        System.out.println("偷偷用就好啦~请勿二次分发(・ε・)");
        System.out.println("正在分析...");

        try {
            // 第一层请求
            String url01 = "https://www.cfmem.com/";
            Document doc1 = Jsoup.connect(url01).get();

            // 查找目标元素
            Element uniqueHref = doc1.selectFirst("a[rel=bookmark]");
            if (uniqueHref == null) {
                System.out.println("未找到书签链接");
                return;
            }
            String hrefSecond = uniqueHref.attr("href");

            // 第二层请求
            Document doc2 = Jsoup.connect(hrefSecond).get();

            // 获取所有符合条件的span
            Elements spans = doc2.select("span[face='Raleway, Arial, sans-serif']");
            if (spans.size() < 2) {
                System.out.println("目标元素不存在");
                return;
            }

            String result = spans.get(1).text().replace("clash -> ", "");

            // 输出结果并复制到剪切板
            System.out.println("已获取链接，可直接前往软件导入");
            System.out.println(result);
            System.out.println("--------------------");

            copyToClipboard(result);

        } catch (IOException e) {
            System.out.println("请求失败: " + e.getMessage());
            // 弹出提示窗口
            SwingUtilities.invokeLater(() -> {
                JOptionPane.showMessageDialog(null, "请求失败!!!", "提示", JOptionPane.INFORMATION_MESSAGE);
            });
        }

    }

    /**
     * 将指定文本复制到系统剪切板
     *
     * @param text 要复制的文本
     */
    private static void copyToClipboard(String text) {
        if (text == null || text.trim().isEmpty()) {
            System.out.println("剪切板内容为空，无法复制");
            return;
        }

        try {
            StringSelection stringSelection = new StringSelection(text);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            System.out.println("内容已成功复制到剪切板！");

            // 弹出提示窗口
            SwingUtilities.invokeLater(() -> {
                JOptionPane.showMessageDialog(null, "已复制到剪切板!!!", "提示", JOptionPane.INFORMATION_MESSAGE);
            });
        } catch (Exception e) {
            System.out.println("剪切板操作失败: " + e.getMessage());
        }
    }
}