package com.inmobi.media;

import android.view.MotionEvent;
import com.google.android.gms.common.api.Api;
import org.json.JSONArray;

/* compiled from: MovementGestureDetector.java */
/* loaded from: classes3.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public float f26017a;

    /* renamed from: b  reason: collision with root package name */
    public float f26018b;

    /* renamed from: c  reason: collision with root package name */
    public float f26019c;

    /* renamed from: d  reason: collision with root package name */
    public float f26020d;

    /* renamed from: g  reason: collision with root package name */
    public float f26023g;

    /* renamed from: h  reason: collision with root package name */
    public JSONArray f26024h;

    /* renamed from: i  reason: collision with root package name */
    public MotionEvent f26025i;

    /* renamed from: k  reason: collision with root package name */
    public final a f26027k;

    /* renamed from: j  reason: collision with root package name */
    public int f26026j = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: l  reason: collision with root package name */
    private final String f26028l = z.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    public int f26021e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f26022f = -1;

    /* compiled from: MovementGestureDetector.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(MotionEvent motionEvent);

        void a(MotionEvent motionEvent, MotionEvent motionEvent2);

        void a(z zVar);
    }

    public z(a aVar) {
        this.f26027k = aVar;
    }

    public static int a(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f11;
        float f15 = f12 - f13;
        return (int) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    public static float a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float degrees = ((float) Math.toDegrees(((float) Math.atan2(f11 - f13, f10 - f12)) - ((float) Math.atan2(f15 - f17, f14 - f16)))) % 360.0f;
        if (degrees < -180.0f) {
            degrees += 360.0f;
        }
        return degrees > 180.0f ? degrees - 360.0f : degrees;
    }
}
