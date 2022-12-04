package EVENT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyModalDialog extends JDialog {
    private JTextField tf = new JTextField(10);
    private JButton okButton = new JButton("OK");

    public MyModalDialog(JFrame frame, String title) {
        super(frame,title); // 모달 다이얼로그로 설정하기 위해서는 생성자 3번재 인자에 true값 입력
        setLayout(new FlowLayout());
        add(tf);
        add(okButton);
        setSize(200, 100);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }

    public String getInput() {
        if(tf.getText().length() == 0) return null;
        else return tf.getText();
    }
}
public class DialogEx2 extends JFrame {
    private MyModalDialog dialog;
    public DialogEx2() {
        super("DialogEx2 예제 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn  = new JButton("Show Modal Dialog");

        dialog = new MyModalDialog(this, "Test Modal Dialog");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);

                String text = dialog.getInput();

                if(text == null) return;
                JButton btn = (JButton)e.getSource();
                btn.setText(text);
            }
        });
        getContentPane().add(btn);
        setSize(250,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new DialogEx2();
    }
}

