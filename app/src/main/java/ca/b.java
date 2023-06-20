package ca;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import ea.n0;

/* compiled from: CaptionStyleCompat.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final b f5334g = new b(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a  reason: collision with root package name */
    public final int f5335a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5336b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5337c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5338d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5339e;

    /* renamed from: f  reason: collision with root package name */
    public final Typeface f5340f;

    public b(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f5335a = i10;
        this.f5336b = i11;
        this.f5337c = i12;
        this.f5338d = i13;
        this.f5339e = i14;
        this.f5340f = typeface;
    }

    public static b a(CaptioningManager.CaptionStyle captionStyle) {
        if (n0.f29709a >= 21) {
            return c(captionStyle);
        }
        return b(captionStyle);
    }

    private static b b(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static b c(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f5334g.f5335a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f5334g.f5336b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f5334g.f5337c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f5334g.f5338d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f5334g.f5339e, captionStyle.getTypeface());
    }
}
