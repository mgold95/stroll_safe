package edu.illinois.strollsafe.util.timer;

/**
 * Interface declaring methods a Timer should have
 *
 * @author Michael Goldstein
 */
public interface Timer {

    void start();

    void stop();

    void pause();

    void resume();

    void reset();

    long getTimeRemaining();

    boolean isRunning();

    boolean hasElapsed();

}
