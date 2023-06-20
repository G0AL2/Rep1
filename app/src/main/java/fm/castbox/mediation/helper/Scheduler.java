package fm.castbox.mediation.helper;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes3.dex */
public class Scheduler {
    private static final String TAG = "Scheduler";
    private final InternalHandler handler = new InternalHandler(Looper.getMainLooper());
    private final long intervalMillis;
    private final Listener listener;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class InternalHandler extends Handler {
        private boolean isPaused;

        public InternalHandler(Looper looper) {
            super(looper);
            this.isPaused = true;
        }

        public synchronized void destroy() {
            pause();
            removeCallbacksAndMessages(null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.isPaused) {
                Log.i(Scheduler.TAG, "handler is paused");
            } else {
                super.handleMessage(message);
            }
        }

        public synchronized boolean isRunning() {
            return !this.isPaused;
        }

        public synchronized void pause() {
            this.isPaused = true;
        }

        public synchronized void resume() {
            this.isPaused = false;
        }

        public synchronized void start() {
            this.isPaused = false;
        }
    }

    /* loaded from: classes3.dex */
    public interface Listener {
        void onSchedule();
    }

    public Scheduler(long j10, Listener listener) {
        this.intervalMillis = j10;
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trigger() {
        this.handler.postDelayed(new Runnable() { // from class: fm.castbox.mediation.helper.Scheduler.1
            @Override // java.lang.Runnable
            public void run() {
                if (Scheduler.this.handler.isRunning()) {
                    Scheduler.this.listener.onSchedule();
                }
                Scheduler.this.handler.removeCallbacksAndMessages(null);
                Scheduler.this.trigger();
            }
        }, this.intervalMillis);
    }

    public void destroy() {
        this.handler.destroy();
    }

    public boolean isScheduling() {
        return this.handler.isRunning();
    }

    public void pause() {
        this.handler.pause();
    }

    public void resume() {
        this.handler.resume();
        trigger();
    }

    public void start() {
        this.handler.start();
        trigger();
    }
}
