import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Homepage extends JFrame {
    private JPanel home;
    private JButton product_button;
    private JButton sale_button;
    private JButton report_button;

    static JDesktopPane desktop;
    static JLayeredPane layered;

    public static void main(String[] args)  {
        new Homepage().setVisible(true);
    }

    public Homepage() {
        UIManager.put("OptionPane.messageFont", new Font("Leelawadee", Font.PLAIN, 12));
        UIManager.put("InternalFrame.titleFont", new Font("Leelawadee", Font.PLAIN, 12));

        setTitle("ร้าน Coffee Shop");
        setSize(1200,680);
        setContentPane(home);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        layered = getLayeredPane();

        product_button.setPreferredSize(new Dimension(300, 100));
        sale_button.setPreferredSize(new Dimension(300, 100));
        report_button.setPreferredSize(new Dimension(300, 100));

        product_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Product product = new Product();
                layered.add(product,new Integer[2]);
                product.setVisible(true);
            }
        });
        sale_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Sales sales = new Sales();
                layered.add(sales,new Integer[2]);
                sales.setVisible(true);
            }
        });
        report_button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Report report = new Report();
                layered.add(report,new Integer[2]);
                report.setVisible(true);
            }
        });
    }

}
