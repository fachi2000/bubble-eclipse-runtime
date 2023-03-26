import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.Font;

public class TestBubble {
    public static void main(String[] args) {
        printRecipes();
    }
		
    public static void printRecipes() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order #1: matcha_bubble_tea\n");
        sb.append("  Ingredients:\n");
        sb.append("    - matcha: 2.5\n");
        sb.append("    - milk: 1.0\n");
        sb.append("  Toppings:\n");
        sb.append("    - boba: 0.5\n");
        sb.append("  Brewing:\n");
        sb.append("    - Tea: green_tea\n");
        sb.append("    - Ice: 100\n");
        sb.append("    - Sugar: 50\n");
        sb.append("  Serving:\n");
        sb.append("    - Size: large\n");
        sb.append("  Pearls:\n");
        sb.append("    - Included\n");
        sb.append("\n");

        JTextArea textArea = new JTextArea(sb.toString());
        textArea.setEditable(false);
        textArea.setFont(new Font("monospaced", Font.BOLD, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 310));

        JDialog dialog = new JDialog();
        dialog.setTitle("Bubble Tea Recipes");
        dialog.setModal(true);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setContentPane(scrollPane);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
}
