package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.utils.t;

/* compiled from: AnimationWrapper.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    Paint f9528a;

    /* renamed from: b  reason: collision with root package name */
    Path f9529b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private int f9530c;

    /* renamed from: d  reason: collision with root package name */
    private int f9531d;

    public a() {
        Paint paint = new Paint();
        this.f9528a = paint;
        paint.setAntiAlias(true);
    }

    public void a(Canvas canvas, b bVar, View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (bVar.getRippleValue() != 0.0f) {
            if (com.bytedance.sdk.component.adexpress.a.a.a.a().c() != null) {
                float[] fArr = null;
                try {
                    fArr = g.b((String) view.getTag(t.e(com.bytedance.sdk.component.adexpress.a.a.a.a().c().b(), "tt_id_ripple_bg")));
                } catch (Exception unused) {
                }
                if (fArr != null) {
                    this.f9528a.setColor(com.bytedance.sdk.component.adexpress.c.b.a(fArr[3] * (1.0f - bVar.getRippleValue()), fArr[0] / 256.0f, fArr[1] / 256.0f, fArr[2] / 256.0f));
                }
            }
            ((ViewGroup) view.getParent()).setClipChildren(true);
            canvas.drawCircle(this.f9530c, this.f9531d, Math.min(i13, i14) * 2 * bVar.getRippleValue(), this.f9528a);
        }
        if (bVar.getShineValue() != 0.0f) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).setClipChildren(true);
            }
            if (view.getParent().getParent() != null) {
                ((ViewGroup) view.getParent().getParent()).setClipChildren(true);
            }
            this.f9529b.reset();
            try {
                i11 = ((Integer) view.getTag(t.e(view.getContext(), "tt_id_shine_width"))).intValue();
            } catch (Exception unused2) {
                i11 = 0;
            }
            if (i11 >= 0) {
                int a10 = (int) com.bytedance.sdk.component.adexpress.c.b.a(view.getContext(), i11);
                Path path = this.f9529b;
                float shineValue = ((this.f9530c * 2) + a10 + (this.f9531d * 2)) * bVar.getShineValue();
                int i15 = this.f9531d;
                path.moveTo((shineValue - ((i15 * 2) + a10)) + (i15 * 2), 0.0f);
                Path path2 = this.f9529b;
                float shineValue2 = ((this.f9530c * 2) + a10 + (this.f9531d * 2)) * bVar.getShineValue();
                int i16 = this.f9531d;
                float f10 = a10;
                path2.lineTo((shineValue2 - ((i16 * 2) + a10)) + f10 + (i16 * 2), 0.0f);
                Path path3 = this.f9529b;
                float shineValue3 = ((this.f9530c * 2) + a10 + (this.f9531d * 2)) * bVar.getShineValue();
                int i17 = this.f9531d;
                path3.lineTo((shineValue3 - ((i17 * 2) + a10)) + f10, i17 * 2);
                Path path4 = this.f9529b;
                float shineValue4 = ((this.f9530c * 2) + a10 + (this.f9531d * 2)) * bVar.getShineValue();
                int i18 = this.f9531d;
                path4.lineTo(shineValue4 - ((i18 * 2) + a10), i18 * 2);
                this.f9529b.close();
                float shineValue5 = ((this.f9530c * 2) + a10 + (this.f9531d * 2)) * bVar.getShineValue();
                float f11 = this.f9531d + (shineValue5 - ((i12 * 2) + a10));
                float shineValue6 = ((this.f9530c * 2) + a10 + (i12 * 2)) * bVar.getShineValue();
                int i19 = this.f9531d;
                this.f9528a.setShader(new LinearGradient(f11, 0.0f, (a10 / 2) + (shineValue6 - ((i19 * 2) + a10)) + i19, i19, Color.parseColor("#10ffffff"), Color.parseColor("#50ffffff"), Shader.TileMode.MIRROR));
                canvas.drawPath(this.f9529b, this.f9528a);
            }
        }
        if (bVar.getMarqueeValue() != 0.0f) {
            try {
                i10 = ((Integer) view.getTag(t.e(view.getContext(), "tt_id_width"))).intValue();
            } catch (Exception unused3) {
                i10 = 0;
            }
            if (i10 >= 0) {
                this.f9529b.reset();
                this.f9529b.moveTo(0.0f, 0.0f);
                this.f9529b.lineTo(this.f9530c * 2, 0.0f);
                this.f9529b.lineTo(this.f9530c * 2, this.f9531d * 2);
                this.f9529b.lineTo(0.0f, this.f9531d * 2);
                this.f9529b.lineTo(0.0f, 0.0f);
                this.f9528a.setShader(new LinearGradient(0.0f, 0.0f, this.f9530c * 2, this.f9531d * 2, new int[]{(int) (bVar.getMarqueeValue() * (-65536.0f)), (int) ((1.0f - bVar.getMarqueeValue()) * (-65536.0f))}, (float[]) null, Shader.TileMode.CLAMP));
                this.f9528a.setColor(-65536);
                this.f9528a.setStyle(Paint.Style.STROKE);
                this.f9528a.setStrokeWidth(i10);
                canvas.drawPath(this.f9529b, this.f9528a);
            }
        }
    }

    public void a(View view, int i10, int i11) {
        String str;
        this.f9530c = i10 / 2;
        this.f9531d = i11 / 2;
        try {
            str = (String) view.getTag(t.e(view.getContext(), "tt_id_direction"));
        } catch (Exception unused) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.f9530c * 2);
            view.setPivotY(this.f9531d);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.f9531d);
        } else {
            view.setPivotX(this.f9530c);
            view.setPivotY(this.f9531d);
        }
    }
}
