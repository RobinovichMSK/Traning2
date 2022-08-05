package day17;

public enum ChessPiece {
    KING_W(100,"♔"), KING_B(100,"♚"),
    QUEEN_W(9,"♕"), QUEEN_B(9,"♛"),
    ROOK_W(5,"♖"), ROOK_B(5,"♜"),
    BISHOP_W(3.5,"♗"), BISHOP_B(3.5,"♝"),
    KNIGHT_W(3,"♘"), KNIGHT_B(3,"♞"),
    PAWN_W(1,"♙"), PAWN_B(1,"♟"),
    EMPTY(-1,"_");

    /*король (англ. king), ферзь (англ. queen), ладья (англ. rook),
    слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).*/
    private double value;
    private String icon;

    ChessPiece(double value, String icon) {
    this.value = value;
    this.icon = icon;

    }

    public double getValue() {
        return value;
    }

    public String getIcon() {
        return icon;
    }
}
