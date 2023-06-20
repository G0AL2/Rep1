package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final a f19674a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19675b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19676c;

    /* renamed from: d  reason: collision with root package name */
    public long f19677d;

    /* renamed from: e  reason: collision with root package name */
    public long f19678e;

    /* renamed from: f  reason: collision with root package name */
    public long f19679f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f19680g;

    /* renamed from: h  reason: collision with root package name */
    public long f19681h;

    /* renamed from: i  reason: collision with root package name */
    public long f19682i;

    /* renamed from: j  reason: collision with root package name */
    public long f19683j;

    /* loaded from: classes2.dex */
    public static final class a implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: e  reason: collision with root package name */
        public static final a f19684e = new a();

        /* renamed from: a  reason: collision with root package name */
        public volatile long f19685a;

        /* renamed from: b  reason: collision with root package name */
        public final Handler f19686b;

        /* renamed from: c  reason: collision with root package name */
        public Choreographer f19687c;

        /* renamed from: d  reason: collision with root package name */
        public int f19688d;

        public a() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f19686b = handler;
            handler.sendEmptyMessage(0);
        }

        public static a a() {
            return f19684e;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f19685a = j10;
            this.f19687c.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f19687c = Choreographer.getInstance();
                return true;
            } else if (i10 == 1) {
                int i11 = this.f19688d + 1;
                this.f19688d = i11;
                if (i11 == 1) {
                    this.f19687c.postFrameCallback(this);
                }
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                int i12 = this.f19688d - 1;
                this.f19688d = i12;
                if (i12 == 0) {
                    this.f19687c.removeFrameCallback(this);
                    this.f19685a = 0L;
                }
                return true;
            }
        }
    }

    public d(Context context) {
        this(a(context), true);
    }

    public final boolean a(long j10, long j11) {
        return Math.abs((j11 - this.f19681h) - (j10 - this.f19682i)) > 20000000;
    }

    public d(double d10, boolean z10) {
        if (z10) {
            this.f19674a = a.a();
            long j10 = (long) (1.0E9d / d10);
            this.f19675b = j10;
            this.f19676c = (j10 * 80) / 100;
            return;
        }
        this.f19674a = null;
        this.f19675b = -1L;
        this.f19676c = -1L;
    }

    public static float a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }
}
