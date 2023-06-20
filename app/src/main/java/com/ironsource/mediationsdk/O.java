package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.J;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O implements com.ironsource.environment.j {

    /* renamed from: u  reason: collision with root package name */
    private static O f26424u;
    private NetworkStateReceiver A;

    /* renamed from: a  reason: collision with root package name */
    ah f26425a;

    /* renamed from: b  reason: collision with root package name */
    int f26426b;

    /* renamed from: c  reason: collision with root package name */
    int f26427c;

    /* renamed from: d  reason: collision with root package name */
    int f26428d;

    /* renamed from: e  reason: collision with root package name */
    int f26429e;

    /* renamed from: f  reason: collision with root package name */
    int f26430f;

    /* renamed from: g  reason: collision with root package name */
    boolean f26431g;

    /* renamed from: i  reason: collision with root package name */
    Handler f26433i;

    /* renamed from: j  reason: collision with root package name */
    CountDownTimer f26434j;

    /* renamed from: l  reason: collision with root package name */
    String f26436l;

    /* renamed from: m  reason: collision with root package name */
    String f26437m;

    /* renamed from: n  reason: collision with root package name */
    com.ironsource.mediationsdk.utils.l f26438n;

    /* renamed from: o  reason: collision with root package name */
    String f26439o;

    /* renamed from: p  reason: collision with root package name */
    SegmentListener f26440p;

    /* renamed from: q  reason: collision with root package name */
    boolean f26441q;

    /* renamed from: r  reason: collision with root package name */
    long f26442r;

    /* renamed from: s  reason: collision with root package name */
    com.ironsource.d.b f26443s;

    /* renamed from: x  reason: collision with root package name */
    private HandlerThread f26447x;

    /* renamed from: z  reason: collision with root package name */
    private AtomicBoolean f26449z;

    /* renamed from: t  reason: collision with root package name */
    private int f26444t = b.f26463e;

    /* renamed from: v  reason: collision with root package name */
    private final String f26445v = "appKey";

    /* renamed from: w  reason: collision with root package name */
    private final String f26446w = O.class.getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    boolean f26432h = false;

    /* renamed from: y  reason: collision with root package name */
    private boolean f26448y = false;

    /* renamed from: k  reason: collision with root package name */
    List<com.ironsource.mediationsdk.utils.i> f26435k = new ArrayList();
    private c C = new c() { // from class: com.ironsource.mediationsdk.O.1
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0329, code lost:
            if (r0.f26427c == r0.f26430f) goto L112;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: Exception -> 0x0373, TryCatch #2 {Exception -> 0x0373, blocks: (B:2:0x0000, B:7:0x001a, B:10:0x002a, B:12:0x0030, B:17:0x003d, B:18:0x0041, B:20:0x004c, B:22:0x0052, B:32:0x00a6, B:34:0x00bd, B:35:0x00c8, B:37:0x00d2, B:38:0x00df, B:40:0x0111, B:42:0x0120, B:47:0x0193, B:49:0x01c8, B:51:0x01d2, B:52:0x01dd, B:54:0x01e5, B:57:0x01ea, B:59:0x01f5, B:61:0x01f9, B:63:0x0201, B:64:0x0206, B:66:0x020c, B:68:0x0210, B:70:0x0218, B:71:0x021d, B:73:0x0223, B:74:0x0228, B:76:0x022e, B:77:0x0233, B:78:0x023b, B:80:0x0241, B:81:0x0253, B:83:0x0259, B:85:0x0265, B:87:0x026d, B:88:0x0276, B:90:0x0288, B:46:0x0190, B:91:0x02b5, B:93:0x02bb, B:94:0x02ca, B:96:0x02d0, B:97:0x02dc, B:99:0x02e1, B:100:0x02e9, B:102:0x02ef, B:103:0x02f9, B:105:0x02fd, B:107:0x0305, B:109:0x0319, B:110:0x031f, B:112:0x0323, B:124:0x036b, B:114:0x032b, B:116:0x0331, B:118:0x033b, B:119:0x033f, B:120:0x0347, B:122:0x034d, B:123:0x0359, B:23:0x0059, B:25:0x0073, B:26:0x0077, B:31:0x009f, B:27:0x007a, B:29:0x0094, B:30:0x0099, B:19:0x0045, B:6:0x0017, B:43:0x0182, B:3:0x0008), top: B:133:0x0000, inners: #0, #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[Catch: Exception -> 0x0373, TryCatch #2 {Exception -> 0x0373, blocks: (B:2:0x0000, B:7:0x001a, B:10:0x002a, B:12:0x0030, B:17:0x003d, B:18:0x0041, B:20:0x004c, B:22:0x0052, B:32:0x00a6, B:34:0x00bd, B:35:0x00c8, B:37:0x00d2, B:38:0x00df, B:40:0x0111, B:42:0x0120, B:47:0x0193, B:49:0x01c8, B:51:0x01d2, B:52:0x01dd, B:54:0x01e5, B:57:0x01ea, B:59:0x01f5, B:61:0x01f9, B:63:0x0201, B:64:0x0206, B:66:0x020c, B:68:0x0210, B:70:0x0218, B:71:0x021d, B:73:0x0223, B:74:0x0228, B:76:0x022e, B:77:0x0233, B:78:0x023b, B:80:0x0241, B:81:0x0253, B:83:0x0259, B:85:0x0265, B:87:0x026d, B:88:0x0276, B:90:0x0288, B:46:0x0190, B:91:0x02b5, B:93:0x02bb, B:94:0x02ca, B:96:0x02d0, B:97:0x02dc, B:99:0x02e1, B:100:0x02e9, B:102:0x02ef, B:103:0x02f9, B:105:0x02fd, B:107:0x0305, B:109:0x0319, B:110:0x031f, B:112:0x0323, B:124:0x036b, B:114:0x032b, B:116:0x0331, B:118:0x033b, B:119:0x033f, B:120:0x0347, B:122:0x034d, B:123:0x0359, B:23:0x0059, B:25:0x0073, B:26:0x0077, B:31:0x009f, B:27:0x007a, B:29:0x0094, B:30:0x0099, B:19:0x0045, B:6:0x0017, B:43:0x0182, B:3:0x0008), top: B:133:0x0000, inners: #0, #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[Catch: Exception -> 0x0373, TryCatch #2 {Exception -> 0x0373, blocks: (B:2:0x0000, B:7:0x001a, B:10:0x002a, B:12:0x0030, B:17:0x003d, B:18:0x0041, B:20:0x004c, B:22:0x0052, B:32:0x00a6, B:34:0x00bd, B:35:0x00c8, B:37:0x00d2, B:38:0x00df, B:40:0x0111, B:42:0x0120, B:47:0x0193, B:49:0x01c8, B:51:0x01d2, B:52:0x01dd, B:54:0x01e5, B:57:0x01ea, B:59:0x01f5, B:61:0x01f9, B:63:0x0201, B:64:0x0206, B:66:0x020c, B:68:0x0210, B:70:0x0218, B:71:0x021d, B:73:0x0223, B:74:0x0228, B:76:0x022e, B:77:0x0233, B:78:0x023b, B:80:0x0241, B:81:0x0253, B:83:0x0259, B:85:0x0265, B:87:0x026d, B:88:0x0276, B:90:0x0288, B:46:0x0190, B:91:0x02b5, B:93:0x02bb, B:94:0x02ca, B:96:0x02d0, B:97:0x02dc, B:99:0x02e1, B:100:0x02e9, B:102:0x02ef, B:103:0x02f9, B:105:0x02fd, B:107:0x0305, B:109:0x0319, B:110:0x031f, B:112:0x0323, B:124:0x036b, B:114:0x032b, B:116:0x0331, B:118:0x033b, B:119:0x033f, B:120:0x0347, B:122:0x034d, B:123:0x0359, B:23:0x0059, B:25:0x0073, B:26:0x0077, B:31:0x009f, B:27:0x007a, B:29:0x0094, B:30:0x0099, B:19:0x0045, B:6:0x0017, B:43:0x0182, B:3:0x0008), top: B:133:0x0000, inners: #0, #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d2 A[Catch: Exception -> 0x0373, TryCatch #2 {Exception -> 0x0373, blocks: (B:2:0x0000, B:7:0x001a, B:10:0x002a, B:12:0x0030, B:17:0x003d, B:18:0x0041, B:20:0x004c, B:22:0x0052, B:32:0x00a6, B:34:0x00bd, B:35:0x00c8, B:37:0x00d2, B:38:0x00df, B:40:0x0111, B:42:0x0120, B:47:0x0193, B:49:0x01c8, B:51:0x01d2, B:52:0x01dd, B:54:0x01e5, B:57:0x01ea, B:59:0x01f5, B:61:0x01f9, B:63:0x0201, B:64:0x0206, B:66:0x020c, B:68:0x0210, B:70:0x0218, B:71:0x021d, B:73:0x0223, B:74:0x0228, B:76:0x022e, B:77:0x0233, B:78:0x023b, B:80:0x0241, B:81:0x0253, B:83:0x0259, B:85:0x0265, B:87:0x026d, B:88:0x0276, B:90:0x0288, B:46:0x0190, B:91:0x02b5, B:93:0x02bb, B:94:0x02ca, B:96:0x02d0, B:97:0x02dc, B:99:0x02e1, B:100:0x02e9, B:102:0x02ef, B:103:0x02f9, B:105:0x02fd, B:107:0x0305, B:109:0x0319, B:110:0x031f, B:112:0x0323, B:124:0x036b, B:114:0x032b, B:116:0x0331, B:118:0x033b, B:119:0x033f, B:120:0x0347, B:122:0x034d, B:123:0x0359, B:23:0x0059, B:25:0x0073, B:26:0x0077, B:31:0x009f, B:27:0x007a, B:29:0x0094, B:30:0x0099, B:19:0x0045, B:6:0x0017, B:43:0x0182, B:3:0x0008), top: B:133:0x0000, inners: #0, #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0111 A[Catch: Exception -> 0x0373, TryCatch #2 {Exception -> 0x0373, blocks: (B:2:0x0000, B:7:0x001a, B:10:0x002a, B:12:0x0030, B:17:0x003d, B:18:0x0041, B:20:0x004c, B:22:0x0052, B:32:0x00a6, B:34:0x00bd, B:35:0x00c8, B:37:0x00d2, B:38:0x00df, B:40:0x0111, B:42:0x0120, B:47:0x0193, B:49:0x01c8, B:51:0x01d2, B:52:0x01dd, B:54:0x01e5, B:57:0x01ea, B:59:0x01f5, B:61:0x01f9, B:63:0x0201, B:64:0x0206, B:66:0x020c, B:68:0x0210, B:70:0x0218, B:71:0x021d, B:73:0x0223, B:74:0x0228, B:76:0x022e, B:77:0x0233, B:78:0x023b, B:80:0x0241, B:81:0x0253, B:83:0x0259, B:85:0x0265, B:87:0x026d, B:88:0x0276, B:90:0x0288, B:46:0x0190, B:91:0x02b5, B:93:0x02bb, B:94:0x02ca, B:96:0x02d0, B:97:0x02dc, B:99:0x02e1, B:100:0x02e9, B:102:0x02ef, B:103:0x02f9, B:105:0x02fd, B:107:0x0305, B:109:0x0319, B:110:0x031f, B:112:0x0323, B:124:0x036b, B:114:0x032b, B:116:0x0331, B:118:0x033b, B:119:0x033f, B:120:0x0347, B:122:0x034d, B:123:0x0359, B:23:0x0059, B:25:0x0073, B:26:0x0077, B:31:0x009f, B:27:0x007a, B:29:0x0094, B:30:0x0099, B:19:0x0045, B:6:0x0017, B:43:0x0182, B:3:0x0008), top: B:133:0x0000, inners: #0, #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x02dc A[Catch: Exception -> 0x0373, TryCatch #2 {Exception -> 0x0373, blocks: (B:2:0x0000, B:7:0x001a, B:10:0x002a, B:12:0x0030, B:17:0x003d, B:18:0x0041, B:20:0x004c, B:22:0x0052, B:32:0x00a6, B:34:0x00bd, B:35:0x00c8, B:37:0x00d2, B:38:0x00df, B:40:0x0111, B:42:0x0120, B:47:0x0193, B:49:0x01c8, B:51:0x01d2, B:52:0x01dd, B:54:0x01e5, B:57:0x01ea, B:59:0x01f5, B:61:0x01f9, B:63:0x0201, B:64:0x0206, B:66:0x020c, B:68:0x0210, B:70:0x0218, B:71:0x021d, B:73:0x0223, B:74:0x0228, B:76:0x022e, B:77:0x0233, B:78:0x023b, B:80:0x0241, B:81:0x0253, B:83:0x0259, B:85:0x0265, B:87:0x026d, B:88:0x0276, B:90:0x0288, B:46:0x0190, B:91:0x02b5, B:93:0x02bb, B:94:0x02ca, B:96:0x02d0, B:97:0x02dc, B:99:0x02e1, B:100:0x02e9, B:102:0x02ef, B:103:0x02f9, B:105:0x02fd, B:107:0x0305, B:109:0x0319, B:110:0x031f, B:112:0x0323, B:124:0x036b, B:114:0x032b, B:116:0x0331, B:118:0x033b, B:119:0x033f, B:120:0x0347, B:122:0x034d, B:123:0x0359, B:23:0x0059, B:25:0x0073, B:26:0x0077, B:31:0x009f, B:27:0x007a, B:29:0x0094, B:30:0x0099, B:19:0x0045, B:6:0x0017, B:43:0x0182, B:3:0x0008), top: B:133:0x0000, inners: #0, #1 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 888
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.O.AnonymousClass1.run():void");
        }
    };
    private a B = a.NOT_INIT;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.O$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26453a;

        static {
            int[] iArr = new int[a.values().length];
            f26453a = iArr;
            try {
                iArr[a.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26453a[a.NOT_INIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26453a[a.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum a {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static int f26459a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static int f26460b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static int f26461c = 2;

        /* renamed from: d  reason: collision with root package name */
        public static int f26462d = 3;

        /* renamed from: e  reason: collision with root package name */
        public static int f26463e = 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public abstract class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        String f26465b;

        /* renamed from: a  reason: collision with root package name */
        boolean f26464a = true;

        /* renamed from: c  reason: collision with root package name */
        protected J.a f26466c = new J.a() { // from class: com.ironsource.mediationsdk.O.c.1
            @Override // com.ironsource.mediationsdk.J.a
            public final void a(String str) {
                c cVar = c.this;
                cVar.f26464a = false;
                cVar.f26465b = str;
            }
        };

        c() {
        }
    }

    private O() {
        this.f26447x = null;
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        this.f26447x = handlerThread;
        handlerThread.start();
        this.f26433i = new Handler(this.f26447x.getLooper());
        this.f26426b = 1;
        this.f26427c = 0;
        this.f26428d = 62;
        this.f26429e = 12;
        this.f26430f = 5;
        this.f26449z = new AtomicBoolean(true);
        this.f26431g = false;
        this.f26441q = false;
        this.f26443s = new com.ironsource.d.b();
    }

    public static synchronized O a() {
        O o10;
        synchronized (O.class) {
            if (f26424u == null) {
                f26424u = new O();
            }
            o10 = f26424u;
        }
        return o10;
    }

    public final void a(Context context, com.ironsource.mediationsdk.utils.l lVar) {
        this.f26443s.e(lVar.a().f26259b);
        this.f26443s.a(lVar.a().f26258a);
        com.ironsource.sdk.f.a aVar = lVar.f27494c.f27237e;
        this.f26443s.f(aVar.i().f27220a);
        this.f26443s.b(aVar.c().f27535c);
        this.f26443s.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
    }

    public final synchronized void a(Context context, String str, String str2) {
        AtomicBoolean atomicBoolean;
        try {
            atomicBoolean = this.f26449z;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            logger.log(ironSourceTag, this.f26446w + ": Multiple calls to init are not allowed", 2);
            return;
        }
        a(a.INIT_IN_PROGRESS);
        this.f26436l = str2;
        this.f26437m = str;
        if (IronSourceUtils.isNetworkConnected(context)) {
            this.f26433i.post(this.C);
        } else {
            this.f26448y = true;
            if (this.A == null) {
                this.A = new NetworkStateReceiver(context, this);
            }
            context.registerReceiver(this.A, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            com.ironsource.environment.e.c.f26160a.c(new Runnable() { // from class: com.ironsource.mediationsdk.O.2
                @Override // java.lang.Runnable
                public final void run() {
                    O.this.f26434j = new CountDownTimer(60000L, 15000L) { // from class: com.ironsource.mediationsdk.O.2.1
                        {
                            super(60000L, 15000L);
                        }

                        @Override // android.os.CountDownTimer
                        public final void onFinish() {
                            O o10 = O.this;
                            if (o10.f26432h) {
                                return;
                            }
                            o10.f26432h = true;
                            for (com.ironsource.mediationsdk.utils.i iVar : o10.f26435k) {
                                iVar.a(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                            }
                            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
                        }

                        @Override // android.os.CountDownTimer
                        public final void onTick(long j10) {
                            if (j10 <= 45000) {
                                O o10 = O.this;
                                o10.f26441q = true;
                                for (com.ironsource.mediationsdk.utils.i iVar : o10.f26435k) {
                                    iVar.f();
                                }
                            }
                        }
                    }.start();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("old status: " + this.B + ", new status: " + aVar + ")");
        this.B = aVar;
    }

    public final void a(com.ironsource.mediationsdk.utils.i iVar) {
        if (iVar == null) {
            return;
        }
        this.f26435k.add(iVar);
    }

    public final synchronized void a(com.ironsource.mediationsdk.utils.l lVar) {
        int i10;
        int i11 = lVar != null ? lVar.f27496e : l.a.f27518a;
        a aVar = this.B;
        if (i11 == l.a.f27519b) {
            i10 = b.f26461c;
        } else {
            int i12 = AnonymousClass3.f26453a[aVar.ordinal()];
            i10 = i12 != 1 ? i12 != 2 ? i12 != 3 ? b.f26459a : b.f26460b : b.f26463e : b.f26462d;
        }
        this.f26444t = i10;
        this.f26443s.a(i10);
    }

    @Override // com.ironsource.environment.j
    public final void a(boolean z10) {
        if (this.f26448y && z10) {
            CountDownTimer countDownTimer = this.f26434j;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f26448y = false;
            this.f26431g = true;
            this.f26433i.post(this.C);
        }
    }

    public final synchronized a b() {
        return this.B;
    }

    public final void b(boolean z10) {
        Map<String, String> map;
        if (z10 && TextUtils.isEmpty(J.a().f26343o) && (map = this.f26438n.f27494c.f27237e.g().f27221a) != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                if (IronSourceUtils.doesClassExist(str)) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    J.a().d(str);
                    return;
                }
            }
        }
    }

    public final synchronized boolean c() {
        return this.f26441q;
    }
}
