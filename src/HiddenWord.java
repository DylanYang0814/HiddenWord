public class HiddenWord {
    private String word = "";

    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
        String hint = "";
        for (int x = 0; x < guess.length(); x++) {

            if (word.indexOf(guess.substring(x, x + 1)) >= 0) {
                if (word.substring(x, x + 1).equals(guess.substring(x, x + 1))) {
                    hint += guess.substring(x, x + 1);
                } else {
                    hint += "+";
                }
            } else {
                hint += "*";
            }
        }
        return hint;
    }
}