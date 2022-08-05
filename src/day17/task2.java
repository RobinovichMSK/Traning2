package day17;

public class task2 {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard(new ChessPiece[][]{
                {ChessPiece.ROOK_B,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_B,ChessPiece.KING_B,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.ROOK_W,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_B,ChessPiece.PAWN_B,ChessPiece.EMPTY,ChessPiece.PAWN_B},
                {ChessPiece.PAWN_B,ChessPiece.EMPTY,ChessPiece.KNIGHT_B,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_B,ChessPiece.EMPTY},
                {ChessPiece.QUEEN_B,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_W,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_B,ChessPiece.PAWN_W,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.BISHOP_W,ChessPiece.PAWN_W,ChessPiece.EMPTY,ChessPiece.EMPTY},
                {ChessPiece.PAWN_W,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.QUEEN_W,ChessPiece.EMPTY,ChessPiece.PAWN_W,ChessPiece.EMPTY,ChessPiece.PAWN_W},
                {ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.ROOK_W,ChessPiece.KING_W,ChessPiece.EMPTY}
        });
        board.print();
    }
}
