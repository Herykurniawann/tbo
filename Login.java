import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel panel1;
    private JTextField tfUserName;
    private JPasswordField tfPassword;
    private JButton loginButton;

    public Login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = tfUserName.getText();
                String password = tfPassword.getText();
                if (username.equals("admin") && password.equals("admin")) {
                    Menu menu = new Menu();
                    menu.startMenu();
                } else {
                    JOptionPane.showMessageDialog(null, "Login Failed");
                    Login login = new Login();
                }
            }
        });

    }

    public static void startLogin() {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
