package de.hsa.games.fatsquirrel.Core.Board;

/**
 * Here are all start Values Placed
 */
class BoardConfig {
    final int WIDTH = 20;
    final int HEIGHT = 20;

    final int BADBEAST = 5;
    final int GOODBEAST = 5;
    final int BADPLANT = 5;
    final int GOODPLANT = 5;

    final int BOTCOUNT = 1;
    final String[] BOTNAME = {"de/hsa/games/fatsquirrel/BotImpl/Bot1"};
    final boolean PLAYERMODE = true;

    //TODO initsialisieren das hier die start werte stehen
    final int MASTER_ENERGY = 1000;
    final int GOODBEAST_ENERGY = 200;
    final int GOODPLANT_ENERGY = 100;
    final int BADBEAST_ENERGY = -150;
    final int BADPLANT_ENERGY = -100;
    final int WALL_ENERGY = -10;

    final int MAX_ROUNDS = 3;
    final int DURATION = 20;
}
