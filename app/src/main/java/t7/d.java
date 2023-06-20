package t7;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b6.b;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;

/* compiled from: TemplateView.java */
/* loaded from: classes2.dex */
public class d extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f37152a;

    /* renamed from: b  reason: collision with root package name */
    private a f37153b;

    /* renamed from: c  reason: collision with root package name */
    private NativeAdView f37154c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f37155d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f37156e;

    /* renamed from: f  reason: collision with root package name */
    private RatingBar f37157f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f37158g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f37159h;

    /* renamed from: i  reason: collision with root package name */
    private MediaView f37160i;

    /* renamed from: j  reason: collision with root package name */
    private Button f37161j;

    /* renamed from: k  reason: collision with root package name */
    private ConstraintLayout f37162k;

    public d(Context context) {
        super(context);
    }

    private boolean a(NativeAd nativeAd) {
        return !TextUtils.isEmpty(nativeAd.getStore()) && TextUtils.isEmpty(nativeAd.getAdvertiser());
    }

    private void b() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        ColorDrawable f10 = this.f37153b.f();
        if (f10 != null) {
            this.f37162k.setBackground(f10);
            TextView textView13 = this.f37155d;
            if (textView13 != null) {
                textView13.setBackground(f10);
            }
            TextView textView14 = this.f37156e;
            if (textView14 != null) {
                textView14.setBackground(f10);
            }
            TextView textView15 = this.f37158g;
            if (textView15 != null) {
                textView15.setBackground(f10);
            }
        }
        Typeface i10 = this.f37153b.i();
        if (i10 != null && (textView12 = this.f37155d) != null) {
            textView12.setTypeface(i10);
        }
        Typeface m10 = this.f37153b.m();
        if (m10 != null && (textView11 = this.f37156e) != null) {
            textView11.setTypeface(m10);
        }
        Typeface q10 = this.f37153b.q();
        if (q10 != null && (textView10 = this.f37158g) != null) {
            textView10.setTypeface(q10);
        }
        Typeface d10 = this.f37153b.d();
        if (d10 != null && (button4 = this.f37161j) != null) {
            button4.setTypeface(d10);
        }
        int j10 = this.f37153b.j();
        if (j10 > 0 && (textView9 = this.f37155d) != null) {
            textView9.setTextColor(j10);
        }
        int n10 = this.f37153b.n();
        if (n10 > 0 && (textView8 = this.f37156e) != null) {
            textView8.setTextColor(n10);
        }
        int r10 = this.f37153b.r();
        if (r10 > 0 && (textView7 = this.f37158g) != null) {
            textView7.setTextColor(r10);
        }
        int e10 = this.f37153b.e();
        if (e10 > 0 && (button3 = this.f37161j) != null) {
            button3.setTextColor(e10);
        }
        float c10 = this.f37153b.c();
        if (c10 > 0.0f && (button2 = this.f37161j) != null) {
            button2.setTextSize(c10);
        }
        float h10 = this.f37153b.h();
        if (h10 > 0.0f && (textView6 = this.f37155d) != null) {
            textView6.setTextSize(h10);
        }
        float l10 = this.f37153b.l();
        if (l10 > 0.0f && (textView5 = this.f37156e) != null) {
            textView5.setTextSize(l10);
        }
        float p10 = this.f37153b.p();
        if (p10 > 0.0f && (textView4 = this.f37158g) != null) {
            textView4.setTextSize(p10);
        }
        ColorDrawable b10 = this.f37153b.b();
        if (b10 != null && (button = this.f37161j) != null) {
            button.setBackground(b10);
        }
        ColorDrawable g10 = this.f37153b.g();
        if (g10 != null && (textView3 = this.f37155d) != null) {
            textView3.setBackground(g10);
        }
        ColorDrawable k10 = this.f37153b.k();
        if (k10 != null && (textView2 = this.f37156e) != null) {
            textView2.setBackground(k10);
        }
        ColorDrawable o10 = this.f37153b.o();
        if (o10 != null && (textView = this.f37158g) != null) {
            textView.setBackground(o10);
        }
        invalidate();
        requestLayout();
    }

    public NativeAdView getNativeAdView() {
        return this.f37154c;
    }

    public String getTemplateTypeName() {
        int i10 = this.f37152a;
        return i10 == c.f37150a ? "medium_template" : i10 == c.f37151b ? "small_template" : "";
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f37154c = (NativeAdView) findViewById(b.f37146f);
        this.f37155d = (TextView) findViewById(b.f37147g);
        this.f37156e = (TextView) findViewById(b.f37149i);
        this.f37158g = (TextView) findViewById(b.f37142b);
        RatingBar ratingBar = (RatingBar) findViewById(b.f37148h);
        this.f37157f = ratingBar;
        ratingBar.setEnabled(false);
        this.f37161j = (Button) findViewById(b.f37143c);
        this.f37159h = (ImageView) findViewById(b.f37144d);
        this.f37160i = (MediaView) findViewById(b.f37145e);
        this.f37162k = (ConstraintLayout) findViewById(b.f37141a);
    }

    public void setNativeAd(NativeAd nativeAd) {
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        NativeAd.Image icon = nativeAd.getIcon();
        this.f37154c.setCallToActionView(this.f37161j);
        this.f37154c.setHeadlineView(this.f37155d);
        this.f37154c.setMediaView(this.f37160i);
        this.f37156e.setVisibility(0);
        if (a(nativeAd)) {
            this.f37154c.setStoreView(this.f37156e);
        } else if (TextUtils.isEmpty(advertiser)) {
            store = "";
        } else {
            this.f37154c.setAdvertiserView(this.f37156e);
            store = advertiser;
        }
        this.f37155d.setText(headline);
        this.f37161j.setText(callToAction);
        if (starRating != null && starRating.doubleValue() > 0.0d) {
            this.f37156e.setVisibility(8);
            this.f37157f.setVisibility(0);
            this.f37157f.setRating(starRating.floatValue());
            this.f37154c.setStarRatingView(this.f37157f);
        } else {
            this.f37156e.setText(store);
            this.f37156e.setVisibility(0);
            this.f37157f.setVisibility(8);
        }
        if (icon != null) {
            this.f37159h.setVisibility(0);
            if (icon.getDrawable() != null) {
                this.f37159h.setImageDrawable(icon.getDrawable());
            } else if (nativeAd.getResponseInfo() != null && "com.google.ads.mediation.pangle.PangleMediationAdapter".equals(nativeAd.getResponseInfo().getMediationAdapterClassName())) {
                try {
                    com.facebook.datasource.c<c4.a<w5.c>> d10 = m4.c.a().d(b6.c.s(icon.getUri()).D(q5.d.HIGH).z(b.c.FULL_FETCH).a(), getContext());
                    c4.a aVar = (c4.a) com.facebook.datasource.d.c(d10);
                    if (aVar != null && (aVar.y() instanceof w5.b)) {
                        this.f37159h.setImageBitmap(((w5.b) aVar.y()).l());
                    }
                    if (d10 != null) {
                        d10.close();
                    }
                } catch (Throwable unused) {
                }
            }
            this.f37154c.setIconView(this.f37159h);
        } else {
            this.f37159h.setVisibility(8);
        }
        TextView textView = this.f37158g;
        if (textView != null) {
            textView.setText(body);
            this.f37154c.setBodyView(this.f37158g);
        }
        this.f37154c.setNativeAd(nativeAd);
    }

    public void setStyles(a aVar) {
        this.f37153b = aVar;
        b();
    }
}
