package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.r;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: TouchesHelper.java */
/* loaded from: classes.dex */
public class m {

    /* compiled from: TouchesHelper.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15849a;

        static {
            int[] iArr = new int[l.values().length];
            f15849a = iArr;
            try {
                iArr[l.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15849a[l.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15849a[l.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15849a[l.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static WritableMap[] a(j jVar) {
        MotionEvent a10 = jVar.a();
        WritableMap[] writableMapArr = new WritableMap[a10.getPointerCount()];
        float x10 = a10.getX() - jVar.c();
        float y10 = a10.getY() - jVar.d();
        for (int i10 = 0; i10 < a10.getPointerCount(); i10++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("pageX", r.a(a10.getX(i10)));
            createMap.putDouble("pageY", r.a(a10.getY(i10)));
            createMap.putDouble("locationX", r.a(a10.getX(i10) - x10));
            createMap.putDouble("locationY", r.a(a10.getY(i10) - y10));
            createMap.putInt("targetSurface", jVar.getSurfaceId());
            createMap.putInt(Analytics.Param.TARGET, jVar.getViewTag());
            createMap.putDouble("timestamp", jVar.getTimestampMs());
            createMap.putDouble("identifier", a10.getPointerId(i10));
            writableMapArr[i10] = createMap;
        }
        return writableMapArr;
    }

    private static WritableArray b(boolean z10, WritableMap... writableMapArr) {
        WritableArray createArray = Arguments.createArray();
        for (WritableMap writableMap : writableMapArr) {
            if (writableMap != null) {
                if (z10) {
                    writableMap = writableMap.copy();
                }
                createArray.pushMap(writableMap);
            }
        }
        return createArray;
    }

    public static void c(RCTModernEventEmitter rCTModernEventEmitter, j jVar) {
        WritableMap[] writableMapArr;
        WritableMap[] writableMapArr2;
        com.facebook.systrace.a.c(0L, "TouchesHelper.sentTouchEventModern(" + jVar.getEventName() + ")");
        l b10 = jVar.b();
        MotionEvent a10 = jVar.a();
        if (a10 == null) {
            ReactSoftExceptionLogger.logSoftException("TouchesHelper", new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
            return;
        }
        WritableMap[] a11 = a(jVar);
        int i10 = a.f15849a[b10.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int actionIndex = a10.getActionIndex();
                WritableMap writableMap = a11[actionIndex];
                a11[actionIndex] = null;
                writableMapArr2 = new WritableMap[]{writableMap};
            } else if (i10 == 3) {
                writableMapArr2 = new WritableMap[a11.length];
                for (int i11 = 0; i11 < a11.length; i11++) {
                    writableMapArr2[i11] = a11[i11].copy();
                }
            } else if (i10 != 4) {
                writableMapArr = a11;
                a11 = null;
            } else {
                writableMapArr = new WritableMap[0];
            }
            a11 = writableMapArr2;
            writableMapArr = a11;
        } else {
            writableMapArr = a11;
            a11 = new WritableMap[]{a11[a10.getActionIndex()].copy()};
        }
        for (WritableMap writableMap2 : a11) {
            WritableMap copy = writableMap2.copy();
            WritableArray b11 = b(true, a11);
            WritableArray b12 = b(true, writableMapArr);
            copy.putArray("changedTouches", b11);
            copy.putArray("touches", b12);
            rCTModernEventEmitter.receiveEvent(jVar.getSurfaceId(), jVar.getViewTag(), jVar.getEventName(), jVar.canCoalesce(), 0, copy, jVar.getEventCategory());
        }
        com.facebook.systrace.a.g(0L);
    }

    public static void d(RCTEventEmitter rCTEventEmitter, j jVar) {
        l b10 = jVar.b();
        WritableArray b11 = b(false, a(jVar));
        MotionEvent a10 = jVar.a();
        WritableArray createArray = Arguments.createArray();
        if (b10 != l.MOVE && b10 != l.CANCEL) {
            if (b10 != l.START && b10 != l.END) {
                throw new RuntimeException("Unknown touch type: " + b10);
            }
            createArray.pushInt(a10.getActionIndex());
        } else {
            for (int i10 = 0; i10 < a10.getPointerCount(); i10++) {
                createArray.pushInt(i10);
            }
        }
        rCTEventEmitter.receiveTouches(l.a(b10), b11, createArray);
    }
}
