package BoardGame;

import BoardGame.Player.Player;
import BoardGame.Team.Team;

public class Cache {
    private static Player currentOperatePlayer;
    private static Team currentOperateTeam;
    private static int currentInputPosition;
    private static char currentInputPieceType;

    public static Player getCurrentOperatePlayer() {
        return currentOperatePlayer;
    }

    public static void setCurrentOperatePlayer(Player currentOperatePlayer) {
        Cache.currentOperatePlayer = currentOperatePlayer;
    }

    public static Team getCurrentOperateTeam() {
        return currentOperateTeam;
    }

    public static void setCurrentOperateTeam(Team currentOperateTeam) {
        Cache.currentOperateTeam = currentOperateTeam;
    }

    public static int getCurrentInputPosition() {
        return currentInputPosition;
    }

    public static void setCurrentInputPosition(int currentInputPosition) {
        Cache.currentInputPosition = currentInputPosition;
    }

    public static char getCurrentInputPieceType() {
        return currentInputPieceType;
    }

    public static void setCurrentInputPieceType(char currentInputPieceType) {
        Cache.currentInputPieceType = currentInputPieceType;
    }
}
