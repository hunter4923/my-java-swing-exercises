import java.awt.*;
import java.awt.event.*;
import java.nio.ByteOrder;

public class InsetsDemo extends Frame {
    public InsetsDemo(){
        add(new Button("This is across the top."), BorderLayout.NORTH);
        add(new Label("The footer message might go here."), BorderLayout.SOUTH);
        add(new Button("Right"), BorderLayout.EAST);
        add(new Button("Left"), BorderLayout.WEST);

        String msg = "The reasonable man adapts " + "himself to the world;\n" + "the unreasonable one persists in " + "trying to adapt the world to himself.\n" + "Therefore all progress depends " + "on the unreasonable man.\n\n" + "            - George Bernard Shaw\n\n";
        TextArea t = new TextArea(msg);
        add(t, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public Insets getInsets() {
        return new Insets(40, 20, 10, 20);
    }

    public static void main(String[] args) {
        InsetsDemo appWin = new InsetsDemo();
        appWin.setSize(new Dimension(300, 220));
        appWin.setTitle("BorderLayoutDemo");
        appWin.setVisible(true);
    }
}
