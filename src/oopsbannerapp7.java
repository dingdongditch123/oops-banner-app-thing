/**
 * OOPS Banner App
 * UC7: Store character patterns in a class
 * 
 * @author Satwik
 * @version 1.6
 */

public class oopsbannerapp7 {

    // CharacterPattern class
    static class CharacterPattern {
        char character;
        String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "     *",
                "     *",
                "***** "
        });

        CharacterPattern[] word = {O, O, P, S};

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[row]).append(" ");
            }

            System.out.println(line);
        }
    }
}