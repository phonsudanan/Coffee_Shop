import javax.swing.*;

public class Product extends JInternalFrame {

public Product() {
    setTitle("รายการสินค้า");
    setSize(1100,640);
    setContentPane(home);
    setClosable(true);
}


    private JPanel home;
}
