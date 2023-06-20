package com.bytedance.sdk.openadsdk.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.common.d;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.k;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.b;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.a.c;
import m3.c;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity {
    AnimatorSet R;
    private LinearLayout S;
    private View T;
    private View U;
    private View V;
    private boolean W;
    private TextView X;
    private TextView Y;
    private TextView Z;

    /* renamed from: aa  reason: collision with root package name */
    private TextView f10906aa;

    /* renamed from: ab  reason: collision with root package name */
    private TTRoundRectImageView f10907ab;

    /* renamed from: ac  reason: collision with root package name */
    private TextView f10908ac;

    /* renamed from: ad  reason: collision with root package name */
    private TextView f10909ad;

    /* renamed from: ae  reason: collision with root package name */
    private long f10910ae;

    /* renamed from: af  reason: collision with root package name */
    private boolean f10911af = false;
    private boolean ag;
    private d ah;
    private LinearLayout ai;

    private void m() {
        this.R = new AnimatorSet();
        LinearLayout linearLayout = this.S;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", -9.0f, 9.0f).setDuration(300L);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.R.play(duration);
            for (int i10 = 1; i10 < this.S.getChildCount(); i10++) {
                float f10 = i10 % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.S.getChildAt(i10), "translationY", -f10, f10).setDuration(300L);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.R.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.R.removeAllListeners();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected String a() {
        return "tt_activity_videolandingpage_link2";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected String c() {
        return "tt_top_back";
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        SSWebView sSWebView;
        this.ag = m.h().g();
        super.onCreate(bundle);
        if (TTAdSdk.isInitSuccess() && this.f10882p != null && (sSWebView = this.f10867a) != null) {
            sSWebView.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(this.f10871e, this.f10875i, this.f10873g, this.M, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTVideoLandingPageLink2Activity.this.T != null && !TTVideoLandingPageLink2Activity.this.W) {
                            TTVideoLandingPageLink2Activity.this.T.setVisibility(8);
                        }
                        if (TTVideoLandingPageLink2Activity.this.ai != null) {
                            TTVideoLandingPageLink2Activity.this.ai.setVisibility(0);
                        }
                        TTVideoLandingPageLink2Activity.this.f10911af = true;
                        TTVideoLandingPageLink2Activity.this.n();
                        TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                        e.a((Context) tTVideoLandingPageLink2Activity, tTVideoLandingPageLink2Activity.f10882p, tTVideoLandingPageLink2Activity.F, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f10910ae, true);
                    } catch (Throwable unused) {
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.a.d, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    TTVideoLandingPageLink2Activity.this.f10910ae = System.currentTimeMillis();
                }
            });
            this.f10867a.setWebChromeClient(new c(this.f10875i, this.M) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.a.c, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    if (TTVideoLandingPageLink2Activity.this.ag && TTVideoLandingPageLink2Activity.this.ah != null && i10 == 100) {
                        TTVideoLandingPageLink2Activity.this.ah.a(webView);
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    if (tTVideoLandingPageLink2Activity.C == null || tTVideoLandingPageLink2Activity.isFinishing() || i10 != 100 || !TTVideoLandingPageLink2Activity.this.C.isShown() || TTVideoLandingPageLink2Activity.this.W) {
                        return;
                    }
                    if (TTVideoLandingPageLink2Activity.this.T != null) {
                        TTVideoLandingPageLink2Activity.this.T.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.ai != null) {
                        TTVideoLandingPageLink2Activity.this.ai.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.this.n();
                }
            });
            TextView textView = (TextView) findViewById(t.e(this, "tt_loading_tip"));
            this.f10908ac = textView;
            if (textView != null && this.f10882p.a() != null) {
                this.f10908ac.setText(this.f10882p.a().c());
            }
            long j10 = 10000;
            n nVar = this.f10882p;
            if (nVar != null && nVar.a() != null) {
                j10 = this.f10882p.a().a() * 1000;
            }
            k.d().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        TTVideoLandingPageLink2Activity.this.W = true;
                        TTVideoLandingPageLink2Activity.this.U.setVisibility(8);
                        TTVideoLandingPageLink2Activity.this.V.setVisibility(0);
                        if (TTVideoLandingPageLink2Activity.this.f10911af) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                        e.a((Context) tTVideoLandingPageLink2Activity, tTVideoLandingPageLink2Activity.f10882p, tTVideoLandingPageLink2Activity.F, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f10910ae, false);
                    } catch (Exception unused) {
                    }
                }
            }, j10);
            return;
        }
        finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    protected void onDestroy() {
        n();
        if (!this.W && this.M != null && this.f10867a != null && this.U.getVisibility() == 8) {
            this.M.a(this.f10867a);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected void d() {
        super.d();
        TextView textView = (TextView) findViewById(t.e(this, "tt_top_dislike"));
        this.Z = textView;
        if (textView != null) {
            textView.setText(t.a(m.a(), "tt_reward_feedback"));
            this.Z.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTDelegateActivity.a(TTVideoLandingPageLink2Activity.this.f10882p, "");
                }
            });
        }
        this.f10906aa = (TextView) findViewById(t.e(this, "tt_top_skip"));
        this.S = (LinearLayout) findViewById(t.e(this.f10871e, "wave_container"));
        this.T = findViewById(t.e(this.f10871e, "tt_browser_webview_loading"));
        this.V = findViewById(t.e(this.f10871e, "tt_back_container"));
        this.U = findViewById(t.e(this.f10871e, "tt_loading_container"));
        this.X = (TextView) findViewById(t.e(this.f10871e, "tt_back_container_title"));
        this.Y = (TextView) findViewById(t.e(this.f10871e, "tt_back_container_des"));
        this.f10907ab = (TTRoundRectImageView) findViewById(t.e(this.f10871e, "tt_back_container_icon"));
        this.f10909ad = (TextView) findViewById(t.e(this.f10871e, "tt_back_container_download"));
        if (this.f10882p.M() != null && !TextUtils.isEmpty(this.f10882p.M().a())) {
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f10882p.M().a(), this.f10907ab);
        }
        this.X.setText(this.f10882p.K());
        this.Y.setText(this.f10882p.V());
        ((TextView) findViewById(t.e(this, "tt_ad_loading_logo"))).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.a(tTVideoLandingPageLink2Activity.f10871e, tTVideoLandingPageLink2Activity.f10882p, tTVideoLandingPageLink2Activity.F);
            }
        });
        if (this.ag) {
            ((ViewStub) findViewById(t.e(this, "tt_browser_new_bottom_bar_view_stub"))).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(t.e(this, "tt_bottom_bar"));
            this.ai = linearLayout;
            linearLayout.setVisibility(8);
            this.ah = new d(this, this.ai, this.f10867a, this.f10882p, "landingpage_split_screen");
            if (this.f10867a.getWebView() != null) {
                this.f10867a.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6

                    /* renamed from: a  reason: collision with root package name */
                    float f10917a = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.f10917a = motionEvent.getY();
                        }
                        if (motionEvent.getAction() == 2) {
                            float y10 = motionEvent.getY();
                            float f10 = this.f10917a;
                            if (y10 - f10 > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.ah != null) {
                                    TTVideoLandingPageLink2Activity.this.ah.a();
                                }
                                return false;
                            } else if (y10 - f10 < -8.0f && TTVideoLandingPageLink2Activity.this.ah != null) {
                                TTVideoLandingPageLink2Activity.this.ah.b();
                            }
                        }
                        return false;
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected void e() {
        if (f()) {
            super.e();
            if (this.f10880n.getNativeVideoController() != null) {
                this.f10880n.getNativeVideoController().a(false);
                ((b) this.f10880n.getNativeVideoController()).g(false);
                this.f10880n.setIsNeedShowDetail(false);
                this.f10878l.setClickable(true);
                this.f10878l.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            TTVideoLandingPageLink2Activity.this.a("click_video");
                            return false;
                        }
                        return false;
                    }
                });
            }
            ((b) this.f10880n.getNativeVideoController()).a(new c.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
                @Override // m3.c.a
                public void a() {
                }

                @Override // m3.c.a
                public void a(long j10, int i10) {
                }

                @Override // m3.c.a
                public void a(long j10, long j11) {
                    if (TTVideoLandingPageLink2Activity.this.f10906aa != null) {
                        int max = (int) Math.max(0L, (j11 - j10) / 1000);
                        TextView textView = TTVideoLandingPageLink2Activity.this.f10906aa;
                        textView.setText(max + "");
                        if (max <= 0) {
                            TTVideoLandingPageLink2Activity.this.f10906aa.setVisibility(8);
                        }
                    }
                }

                @Override // m3.c.a
                public void b(long j10, int i10) {
                }
            });
            return;
        }
        try {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f10882p.P().get(0), imageView);
            this.f10878l.setVisibility(0);
            this.f10878l.removeAllViews();
            this.f10878l.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    e.b(m.a(), TTVideoLandingPageLink2Activity.this.f10882p, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected boolean f() {
        int i10 = this.f10879m;
        return i10 == 5 || i10 == 15 || i10 == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void j() {
        super.j();
        n nVar = this.f10882p;
        if (nVar != null) {
            nVar.a(true);
        }
        TextView textView = this.f10909ad;
        if (textView != null) {
            textView.setText(b());
            this.f10909ad.setClickable(true);
            this.f10909ad.setOnClickListener(this.Q);
            this.f10909ad.setOnTouchListener(this.Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        e.a(this.f10871e, this.f10882p, "landingpage_split_screen", str, (JSONObject) null);
    }
}
