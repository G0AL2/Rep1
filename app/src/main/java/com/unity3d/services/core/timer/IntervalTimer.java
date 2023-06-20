package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.IAppActiveListener;
import com.unity3d.services.core.lifecycle.LifecycleCache;
import com.unity3d.services.core.lifecycle.LifecycleEvent;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class IntervalTimer implements IIntervalTimer, IAppActiveListener {
    private final Integer _intervalDuration;
    private LifecycleCache _lifecycleCache;
    private Integer _nextInterval;
    private final String _timedActivityName;
    private IIntervalTimerListener _timerListener;
    private ScheduledExecutorService _timerService;
    private final Integer _totalDurationMs;
    private final Integer _totalIntervals;
    private final AtomicBoolean _isRunning = new AtomicBoolean(false);
    private final AtomicBoolean _hasPaused = new AtomicBoolean(false);
    private final AtomicInteger _currentPosition = new AtomicInteger(0);
    private final Integer _delayMs = 1000;

    /* renamed from: com.unity3d.services.core.timer.IntervalTimer$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent;

        static {
            int[] iArr = new int[LifecycleEvent.values().length];
            $SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent = iArr;
            try {
                iArr[LifecycleEvent.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent[LifecycleEvent.RESUMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public IntervalTimer(String str, Integer num, Integer num2, IIntervalTimerListener iIntervalTimerListener, LifecycleCache lifecycleCache) {
        this._timedActivityName = str;
        this._totalDurationMs = num;
        this._totalIntervals = num2;
        this._timerListener = iIntervalTimerListener;
        this._lifecycleCache = lifecycleCache;
        int intValue = num2.intValue();
        int intValue2 = num.intValue();
        Integer valueOf = Integer.valueOf(intValue != 0 ? intValue2 / num2.intValue() : intValue2);
        this._intervalDuration = valueOf;
        this._nextInterval = valueOf;
        this._lifecycleCache.addListener(str, this);
    }

    private void schedule() {
        try {
            this._timerService.scheduleAtFixedRate(new Runnable() { // from class: com.unity3d.services.core.timer.IntervalTimer.1
                @Override // java.lang.Runnable
                public void run() {
                    IntervalTimer.this.onNextMs();
                }
            }, this._delayMs.intValue(), this._delayMs.intValue(), TimeUnit.MILLISECONDS);
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException | RejectedExecutionException e10) {
            DeviceLog.debug("ERROR: IntervalTimer failed to start due to exception " + e10.getLocalizedMessage());
        }
    }

    @Override // com.unity3d.services.core.timer.IIntervalTimer
    public void kill() {
        stopTimer();
        this._lifecycleCache.removeListener(this._timedActivityName);
        this._timerListener = null;
    }

    public void killIfCompleted() {
        if (this._nextInterval.compareTo(this._totalDurationMs) >= 0) {
            kill();
        }
    }

    @Override // com.unity3d.services.core.lifecycle.IAppActiveListener
    public void onAppStateChanged(LifecycleEvent lifecycleEvent) {
        int i10 = AnonymousClass2.$SwitchMap$com$unity3d$services$core$lifecycle$LifecycleEvent[lifecycleEvent.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 && this._hasPaused.get()) {
                this._hasPaused.getAndSet(false);
                start(Executors.newSingleThreadScheduledExecutor());
                return;
            }
            return;
        }
        this._hasPaused.getAndSet(true);
        stopTimer();
    }

    @Override // com.unity3d.services.core.timer.IIntervalTimer
    public void onNextInterval() {
        IIntervalTimerListener iIntervalTimerListener = this._timerListener;
        if (iIntervalTimerListener != null) {
            iIntervalTimerListener.onNextIntervalTriggered();
        }
        killIfCompleted();
        this._nextInterval = Integer.valueOf(this._nextInterval.intValue() + this._intervalDuration.intValue());
    }

    public void onNextMs() {
        if (this._currentPosition.addAndGet(this._delayMs.intValue()) >= this._nextInterval.intValue()) {
            onNextInterval();
        }
    }

    @Override // com.unity3d.services.core.timer.IIntervalTimer
    public void start(ScheduledExecutorService scheduledExecutorService) {
        if (this._isRunning.compareAndSet(false, true)) {
            this._timerService = scheduledExecutorService;
            schedule();
        }
    }

    public void stopTimer() {
        ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this._timerService.shutdown();
        }
        this._isRunning.getAndSet(false);
    }
}
