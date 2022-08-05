package day17;

public class task1 {
    public static void main(String[] args) {
        ChessPiece[] pieces = {ChessPiece.PAWN_B, ChessPiece.PAWN_B,
                ChessPiece.PAWN_B, ChessPiece.PAWN_B,
                ChessPiece.ROOK_W, ChessPiece.ROOK_W,
                ChessPiece.ROOK_W, ChessPiece.ROOK_W};

        for (ChessPiece chessPiece : pieces)
            System.out.print(chessPiece.getIcon());
    }
}
