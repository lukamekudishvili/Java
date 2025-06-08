public record Card(Suit suit, String face, int rank) {
    public enum Suit{
        CLUB, DIAMOND, HEART, SPADE;
        public char getImage(){
            return (new char[]{9827,9830,9829,9824})[this.ordinal()];
        }
    }

    @Override
    public String toString() {
        int index=face.equals("10")?2:1;
        String fsceString=face.substring(0,index);
    }
}
