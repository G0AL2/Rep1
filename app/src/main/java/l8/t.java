package l8;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import ea.n0;

/* compiled from: AudioTimestampPoller.java */
/* loaded from: classes2.dex */
final class t {

    /* renamed from: a  reason: collision with root package name */
    private final a f33905a;

    /* renamed from: b  reason: collision with root package name */
    private int f33906b;

    /* renamed from: c  reason: collision with root package name */
    private long f33907c;

    /* renamed from: d  reason: collision with root package name */
    private long f33908d;

    /* renamed from: e  reason: collision with root package name */
    private long f33909e;

    /* renamed from: f  reason: collision with root package name */
    private long f33910f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioTimestampPoller.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f33911a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f33912b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f33913c;

        /* renamed from: d  reason: collision with root package name */
        private long f33914d;

        /* renamed from: e  reason: collision with root package name */
        private long f33915e;

        public a(AudioTrack audioTrack) {
            this.f33911a = audioTrack;
        }

        public long a() {
            return this.f33915e;
        }

        public long b() {
            return this.f33912b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f33911a.getTimestamp(this.f33912b);
            if (timestamp) {
                long j10 = this.f33912b.framePosition;
                if (this.f33914d > j10) {
                    this.f33913c++;
                }
                this.f33914d = j10;
                this.f33915e = j10 + (this.f33913c << 32);
            }
            return timestamp;
        }
    }

    public t(AudioTrack audioTrack) {
        if (n0.f29709a >= 19) {
            this.f33905a = new a(audioTrack);
            g();
            return;
        }
        this.f33905a = null;
        h(3);
    }

    private void h(int i10) {
        this.f33906b = i10;
        if (i10 == 0) {
            this.f33909e = 0L;
            this.f33910f = -1L;
            this.f33907c = System.nanoTime() / 1000;
            this.f33908d = 10000L;
        } else if (i10 == 1) {
            this.f33908d = 10000L;
        } else if (i10 == 2 || i10 == 3) {
            this.f33908d = 10000000L;
        } else if (i10 == 4) {
            this.f33908d = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }

    public void a() {
        if (this.f33906b == 4) {
            g();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.f33905a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.f33905a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f33906b == 2;
    }

    @TargetApi(19)
    public boolean e(long j10) {
        a aVar = this.f33905a;
        if (aVar == null || j10 - this.f33909e < this.f33908d) {
            return false;
        }
        this.f33909e = j10;
        boolean c10 = aVar.c();
        int i10 = this.f33906b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c10) {
                        g();
                    }
                } else if (!c10) {
                    g();
                }
            } else if (c10) {
                if (this.f33905a.a() > this.f33910f) {
                    h(2);
                }
            } else {
                g();
            }
        } else if (c10) {
            if (this.f33905a.b() < this.f33907c) {
                return false;
            }
            this.f33910f = this.f33905a.a();
            h(1);
        } else if (j10 - this.f33907c > 500000) {
            h(3);
        }
        return c10;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f33905a != null) {
            h(0);
        }
    }
}
