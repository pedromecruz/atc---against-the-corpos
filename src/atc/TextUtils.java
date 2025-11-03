package atc;

public class TextUtils {

    // Slow Print padrão
    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    // Slow Print sem quebra de linha
    public static void slowPrintInline(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    // Pequeno delay genérico (pausa sem texto)
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // (Opcional) Função para “limpar” a tela
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}


