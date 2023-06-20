package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: JSTouchDispatcher.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f15863e;

    /* renamed from: a  reason: collision with root package name */
    private int f15859a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f15860b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    private boolean f15861c = false;

    /* renamed from: d  reason: collision with root package name */
    private long f15862d = Long.MIN_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private final com.facebook.react.uimanager.events.k f15864f = new com.facebook.react.uimanager.events.k();

    public i(ViewGroup viewGroup) {
        this.f15863e = viewGroup;
    }

    private void a(MotionEvent motionEvent, com.facebook.react.uimanager.events.d dVar) {
        if (this.f15859a == -1) {
            z3.a.G("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        f6.a.b(!this.f15861c, "Expected to not have already sent a cancel for this gesture");
        int f10 = t0.f(this.f15863e);
        int i10 = this.f15859a;
        com.facebook.react.uimanager.events.l lVar = com.facebook.react.uimanager.events.l.CANCEL;
        long j10 = this.f15862d;
        float[] fArr = this.f15860b;
        ((com.facebook.react.uimanager.events.d) f6.a.c(dVar)).g(com.facebook.react.uimanager.events.j.f(f10, i10, lVar, motionEvent, j10, fArr[0], fArr[1], this.f15864f));
    }

    private int b(MotionEvent motionEvent) {
        return o0.b(motionEvent.getX(), motionEvent.getY(), this.f15863e, this.f15860b, null);
    }

    public void c(MotionEvent motionEvent, com.facebook.react.uimanager.events.d dVar) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f15859a != -1) {
                z3.a.j("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.f15861c = false;
            this.f15862d = motionEvent.getEventTime();
            this.f15859a = b(motionEvent);
            int f10 = t0.f(this.f15863e);
            int i10 = this.f15859a;
            com.facebook.react.uimanager.events.l lVar = com.facebook.react.uimanager.events.l.START;
            long j10 = this.f15862d;
            float[] fArr = this.f15860b;
            dVar.g(com.facebook.react.uimanager.events.j.f(f10, i10, lVar, motionEvent, j10, fArr[0], fArr[1], this.f15864f));
        } else if (this.f15861c) {
        } else {
            if (this.f15859a == -1) {
                z3.a.j("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            } else if (action == 1) {
                b(motionEvent);
                int f11 = t0.f(this.f15863e);
                int i11 = this.f15859a;
                com.facebook.react.uimanager.events.l lVar2 = com.facebook.react.uimanager.events.l.END;
                long j11 = this.f15862d;
                float[] fArr2 = this.f15860b;
                dVar.g(com.facebook.react.uimanager.events.j.f(f11, i11, lVar2, motionEvent, j11, fArr2[0], fArr2[1], this.f15864f));
                this.f15859a = -1;
                this.f15862d = Long.MIN_VALUE;
            } else if (action == 2) {
                b(motionEvent);
                int f12 = t0.f(this.f15863e);
                int i12 = this.f15859a;
                com.facebook.react.uimanager.events.l lVar3 = com.facebook.react.uimanager.events.l.MOVE;
                long j12 = this.f15862d;
                float[] fArr3 = this.f15860b;
                dVar.g(com.facebook.react.uimanager.events.j.f(f12, i12, lVar3, motionEvent, j12, fArr3[0], fArr3[1], this.f15864f));
            } else if (action == 5) {
                int f13 = t0.f(this.f15863e);
                int i13 = this.f15859a;
                com.facebook.react.uimanager.events.l lVar4 = com.facebook.react.uimanager.events.l.START;
                long j13 = this.f15862d;
                float[] fArr4 = this.f15860b;
                dVar.g(com.facebook.react.uimanager.events.j.f(f13, i13, lVar4, motionEvent, j13, fArr4[0], fArr4[1], this.f15864f));
            } else if (action == 6) {
                int f14 = t0.f(this.f15863e);
                int i14 = this.f15859a;
                com.facebook.react.uimanager.events.l lVar5 = com.facebook.react.uimanager.events.l.END;
                long j14 = this.f15862d;
                float[] fArr5 = this.f15860b;
                dVar.g(com.facebook.react.uimanager.events.j.f(f14, i14, lVar5, motionEvent, j14, fArr5[0], fArr5[1], this.f15864f));
            } else if (action == 3) {
                if (this.f15864f.c(motionEvent.getDownTime())) {
                    a(motionEvent, dVar);
                } else {
                    z3.a.j("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
                this.f15859a = -1;
                this.f15862d = Long.MIN_VALUE;
            } else {
                z3.a.G("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f15859a);
            }
        }
    }

    public void d(MotionEvent motionEvent, com.facebook.react.uimanager.events.d dVar) {
        if (this.f15861c) {
            return;
        }
        a(motionEvent, dVar);
        this.f15861c = true;
        this.f15859a = -1;
    }
}
