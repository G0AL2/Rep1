package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;

/* compiled from: TouchEvent.java */
/* loaded from: classes.dex */
public class j extends c<j> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f15834f = "j";

    /* renamed from: g  reason: collision with root package name */
    private static final h0.f<j> f15835g = new h0.f<>(3);

    /* renamed from: a  reason: collision with root package name */
    private MotionEvent f15836a;

    /* renamed from: b  reason: collision with root package name */
    private l f15837b;

    /* renamed from: c  reason: collision with root package name */
    private short f15838c;

    /* renamed from: d  reason: collision with root package name */
    private float f15839d;

    /* renamed from: e  reason: collision with root package name */
    private float f15840e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TouchEvent.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15841a;

        static {
            int[] iArr = new int[l.values().length];
            f15841a = iArr;
            try {
                iArr[l.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15841a[l.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15841a[l.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15841a[l.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private j() {
    }

    private void e(int i10, int i11, l lVar, MotionEvent motionEvent, long j10, float f10, float f11, k kVar) {
        super.init(i10, i11, motionEvent.getEventTime());
        short s10 = 0;
        SoftAssertions.assertCondition(j10 != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            kVar.a(j10);
        } else if (action == 1) {
            kVar.e(j10);
        } else if (action == 2) {
            s10 = kVar.b(j10);
        } else if (action == 3) {
            kVar.e(j10);
        } else if (action != 5 && action != 6) {
            throw new RuntimeException("Unhandled MotionEvent action: " + action);
        } else {
            kVar.d(j10);
        }
        this.f15837b = lVar;
        this.f15836a = MotionEvent.obtain(motionEvent);
        this.f15838c = s10;
        this.f15839d = f10;
        this.f15840e = f11;
    }

    public static j f(int i10, int i11, l lVar, MotionEvent motionEvent, long j10, float f10, float f11, k kVar) {
        j b10 = f15835g.b();
        if (b10 == null) {
            b10 = new j();
        }
        b10.e(i10, i11, lVar, (MotionEvent) f6.a.c(motionEvent), j10, f10, f11, kVar);
        return b10;
    }

    private boolean g() {
        if (this.f15836a == null) {
            ReactSoftExceptionLogger.logSoftException(f15834f, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
            return false;
        }
        return true;
    }

    public MotionEvent a() {
        f6.a.c(this.f15836a);
        return this.f15836a;
    }

    public l b() {
        return (l) f6.a.c(this.f15837b);
    }

    public float c() {
        return this.f15839d;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        int i10 = a.f15841a[((l) f6.a.c(this.f15837b)).ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.f15837b);
    }

    public float d() {
        return this.f15840e;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        if (g()) {
            m.d(rCTEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        if (g()) {
            rCTModernEventEmitter.receiveTouches(this);
        }
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return this.f15838c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.events.c
    public int getEventCategory() {
        l lVar = this.f15837b;
        if (lVar == null) {
            return 2;
        }
        int i10 = a.f15841a[lVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                return super.getEventCategory();
            }
            return 4;
        }
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return l.a((l) f6.a.c(this.f15837b));
    }

    @Override // com.facebook.react.uimanager.events.c
    public void onDispose() {
        MotionEvent motionEvent = this.f15836a;
        this.f15836a = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            f15835g.a(this);
        } catch (IllegalStateException e10) {
            ReactSoftExceptionLogger.logSoftException(f15834f, e10);
        }
    }
}
