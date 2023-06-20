package s7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.z;
import com.google.android.ads.mediationtestsuite.dataobjects.Caption;
import com.google.android.ads.mediationtestsuite.viewmodels.TestState;

/* compiled from: CaptionView.java */
/* loaded from: classes2.dex */
public class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f36765a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f36766b;

    /* renamed from: c  reason: collision with root package name */
    private Caption f36767c;

    /* renamed from: d  reason: collision with root package name */
    private View f36768d;

    public c(Context context, Caption caption) {
        super(context);
        this.f36767c = caption;
        b(context);
        a();
    }

    private void a() {
        TestState b10 = this.f36767c.b();
        int color = getResources().getColor(b10.g());
        Drawable r10 = androidx.core.graphics.drawable.a.r(androidx.core.content.b.f(getContext(), com.google.android.ads.mediationtestsuite.c.f20789b));
        androidx.core.graphics.drawable.a.n(r10, color);
        z.u0(this.f36768d, r10);
        androidx.core.widget.f.c(this.f36765a, ColorStateList.valueOf(getResources().getColor(b10.j())));
        this.f36765a.setImageResource(b10.h());
        String string = getResources().getString(this.f36767c.a().getStringResId());
        if (this.f36767c.c() != null) {
            string = getResources().getString(com.google.android.ads.mediationtestsuite.g.O0, string, this.f36767c.c());
        }
        this.f36766b.setText(string);
    }

    private void b(Context context) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.google.android.ads.mediationtestsuite.e.f20840l, this);
        this.f36765a = (ImageView) findViewById(com.google.android.ads.mediationtestsuite.d.f20802c);
        this.f36766b = (TextView) findViewById(com.google.android.ads.mediationtestsuite.d.f20803d);
        this.f36768d = findViewById(com.google.android.ads.mediationtestsuite.d.f20808i);
        if (this.f36767c != null) {
            a();
        }
    }
}
