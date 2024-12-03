class Letter {
    private final char character;

    public Letter(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    public boolean isVowel() {
        return "aeiouAEIOU".indexOf(character) != -1;
    }
}
