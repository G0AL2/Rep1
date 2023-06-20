package com.inmobi.media;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.chartboost.sdk.CBLocation;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ImagesContract;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.eb;
import com.inmobi.media.ec;
import com.inmobi.media.er;
import com.inmobi.media.fq;
import com.inmobi.media.j;
import com.inmobi.media.jg;
import com.inmobi.media.z;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import fm.castbox.mediation.widget.AdView;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RenderView.java */
@SuppressLint({"SetJavaScriptEnabled", "ViewConstructor", "ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public final class q extends WebView implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, cw, j, jg.a, l, z.a {
    private byte A;
    private q B;
    private WeakReference<ViewGroup> C;
    private s D;
    private fq E;
    private boolean F;
    private cx G;
    private de H;
    private JSONObject I;
    private JSONObject J;
    private boolean K;
    private final Object L;
    private final Object M;
    private boolean N;
    private View O;
    private WebChromeClient.CustomViewCallback P;
    private int Q;
    private boolean R;
    private long S;
    private String T;
    private String U;
    private j V;
    private boolean W;
    private final ec.a aA;
    private final j.a aC;
    private final WebChromeClient aD;

    /* renamed from: aa  reason: collision with root package name */
    private long f25946aa;

    /* renamed from: ab  reason: collision with root package name */
    private String f25947ab;

    /* renamed from: ac  reason: collision with root package name */
    private ei f25948ac;

    /* renamed from: ad  reason: collision with root package name */
    private ec f25949ad;

    /* renamed from: ae  reason: collision with root package name */
    private final Set<du> f25950ae;

    /* renamed from: af  reason: collision with root package name */
    private dw f25951af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private int aj;
    private int ak;
    private String al;
    private int[] am;
    private long an;
    private int ao;
    private int ap;
    private int aq;
    private final z ar;
    private final GestureDetector as;
    private m at;
    private dd au;
    private final r av;
    private w aw;
    private String ax;
    private final f ay;
    private final hm az;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<Activity> f25952b;

    /* renamed from: c  reason: collision with root package name */
    boolean f25953c;

    /* renamed from: d  reason: collision with root package name */
    public String f25954d;

    /* renamed from: e  reason: collision with root package name */
    public byte f25955e;

    /* renamed from: f  reason: collision with root package name */
    public cz f25956f;

    /* renamed from: g  reason: collision with root package name */
    public dc f25957g;

    /* renamed from: h  reason: collision with root package name */
    public db f25958h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f25959i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f25960j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f25961k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f25962l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f25963m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f25964n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f25965o;

    /* renamed from: p  reason: collision with root package name */
    public String f25966p;

    /* renamed from: q  reason: collision with root package name */
    public AtomicBoolean f25967q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f25968r;

    /* renamed from: s  reason: collision with root package name */
    public String f25969s;

    /* renamed from: t  reason: collision with root package name */
    public ai f25970t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f25971u;

    /* renamed from: v  reason: collision with root package name */
    public k f25972v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f25973w;

    /* renamed from: x  reason: collision with root package name */
    public String f25974x;

    /* renamed from: y  reason: collision with root package name */
    public final bh f25975y;

    /* renamed from: a  reason: collision with root package name */
    public static final s f25944a = new s() { // from class: com.inmobi.media.q.1
        @Override // com.inmobi.media.s
        public final jh c_() {
            return jh.a();
        }
    };

    /* renamed from: z  reason: collision with root package name */
    private static final String f25945z = q.class.getSimpleName();
    private static final eb.a aB = new eb.a() { // from class: com.inmobi.media.q.7

        /* renamed from: a  reason: collision with root package name */
        private long f25997a;

        @Override // com.inmobi.media.eb.a
        public final boolean a(View view) {
            if (view instanceof q) {
                q qVar = (q) view;
                Rect rect = new Rect();
                if (qVar.getGlobalVisibleRect(rect) && rect.intersect(qVar.getAdFrameRect())) {
                    Bitmap createBitmap = Bitmap.createBitmap(qVar.getWidth(), qVar.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawBitmap(createBitmap, 0.0f, 0.0f, new Paint());
                    qVar.draw(canvas);
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, ic.b(qVar.getWidth()), ic.b(qVar.getHeight()), true);
                    int i10 = qVar.am[0];
                    int i11 = qVar.am[1];
                    int i12 = qVar.am[2] + i10;
                    int i13 = qVar.am[3] + i11;
                    Bitmap bitmap = null;
                    if (i10 < createScaledBitmap.getWidth() && i11 < createScaledBitmap.getHeight()) {
                        if (i10 < 0) {
                            i10 = 0;
                        }
                        if (i11 < 0) {
                            i11 = 0;
                        }
                        if (i12 > createScaledBitmap.getWidth()) {
                            i12 = createScaledBitmap.getWidth();
                        }
                        if (i13 > createScaledBitmap.getHeight()) {
                            i13 = createScaledBitmap.getHeight();
                        }
                        bitmap = Bitmap.createBitmap(createScaledBitmap, i10, i11, Math.max(i12 - i10, 0), Math.max(i13 - i11, 0));
                    }
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 == null) {
                        return false;
                    }
                    int width = bitmap2.getWidth() * bitmap2.getHeight();
                    int[] iArr = new int[width];
                    bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                    int i14 = 0;
                    for (int i15 = 0; i15 < width; i15++) {
                        int i16 = iArr[i15];
                        if (i16 > -16777216 && i16 < 0 && (i14 = i14 + 1) >= qVar.ao) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }

        @Override // com.inmobi.media.ei.a
        public final boolean a(View view, View view2, int i10, Object obj) {
            if (view2 != null && view2.getVisibility() == 0 && view != null && view.getParent() != null && view2.isShown()) {
                q qVar = view2 instanceof q ? (q) view2 : null;
                if (qVar == null) {
                    return false;
                }
                if (qVar.getPlacementType() != 1 && (qVar.getHeight() <= 0 || qVar.getWidth() <= 0)) {
                    return false;
                }
                Rect rect = new Rect();
                if (!qVar.getGlobalVisibleRect(rect)) {
                    return false;
                }
                this.f25997a = rect.height() * rect.width();
                if (qVar.getPlacementType() == 1) {
                    qVar.an = qVar.getWidth() * qVar.getHeight();
                }
                if (qVar.an > 0 && this.f25997a * 100 >= i10 * qVar.an) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x007b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007f A[SYNTHETIC] */
        @Override // com.inmobi.media.ei.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(android.view.View r11, android.view.View r12, int r13) {
            /*
                r10 = this;
                android.view.ViewParent r0 = r11.getParent()
                boolean r0 = r0 instanceof android.view.ViewGroup
                if (r0 == 0) goto Lf
                android.view.ViewParent r0 = r11.getParent()
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                goto L10
            Lf:
                r0 = 0
            L10:
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L1d
                boolean r3 = r10.a(r0, r12, r13)
                if (r3 == 0) goto L1b
                goto L1d
            L1b:
                r3 = 0
                goto L1e
            L1d:
                r3 = 1
            L1e:
                if (r0 == 0) goto L82
                int r11 = r0.indexOfChild(r11)
                int r11 = r11 + r2
            L25:
                int r4 = r0.getChildCount()
                if (r11 >= r4) goto L82
                android.view.View r4 = r0.getChildAt(r11)
                int r5 = r4.getVisibility()
                if (r5 != 0) goto L7f
                boolean r5 = r12 instanceof com.inmobi.media.q
                if (r5 != 0) goto L3b
            L39:
                r4 = 1
                goto L79
            L3b:
                android.graphics.Rect r5 = new android.graphics.Rect
                r5.<init>()
                android.graphics.Rect r6 = new android.graphics.Rect
                r6.<init>()
                r12.getGlobalVisibleRect(r5)
                r4.getGlobalVisibleRect(r6)
                boolean r4 = r6.intersect(r5)
                int r5 = r6.width()
                int r6 = r6.height()
                int r5 = r5 * r6
                if (r4 == 0) goto L78
                int r5 = r5 * 100
                long r4 = (long) r5
                long r6 = r10.f25997a
                r8 = 100
                long r6 = r6 * r8
                long r4 = r4 - r6
                long r4 = java.lang.Math.abs(r4)
                r6 = r12
                com.inmobi.media.q r6 = (com.inmobi.media.q) r6
                long r6 = com.inmobi.media.q.d(r6)
                long r8 = (long) r13
                long r6 = r6 * r8
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 >= 0) goto L78
                goto L39
            L78:
                r4 = 0
            L79:
                if (r4 == 0) goto L7f
                com.inmobi.media.q.m()
                return r1
            L7f:
                int r11 = r11 + 1
                goto L25
            L82:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.q.AnonymousClass7.a(android.view.View, android.view.View, int):boolean");
        }
    };

    public q(Context context, byte b10, Set<du> set, String str, Boolean bool, String str2) {
        super(context.getApplicationContext());
        this.A = (byte) 0;
        this.f25952b = new WeakReference<>(null);
        this.f25953c = false;
        this.f25954d = CBLocation.LOCATION_DEFAULT;
        this.f25960j = true;
        this.f25961k = true;
        this.f25962l = false;
        this.K = true;
        this.f25963m = false;
        this.f25964n = false;
        this.f25965o = false;
        this.f25966p = null;
        this.f25967q = new AtomicBoolean(false);
        this.L = new Object();
        this.M = new Object();
        this.N = true;
        this.Q = -1;
        this.R = false;
        this.S = Long.MIN_VALUE;
        this.W = false;
        this.f25946aa = -1L;
        this.f25947ab = "html";
        this.ai = true;
        this.ap = RecyclerView.UNDEFINED_DURATION;
        this.aq = RecyclerView.UNDEFINED_DURATION;
        this.f25973w = false;
        this.av = new r();
        this.ax = "DEFAULT";
        this.ay = new f() { // from class: com.inmobi.media.q.4
            @Override // com.inmobi.media.f
            public final void a(String str3) {
                q.this.at.a(str3);
            }

            @Override // com.inmobi.media.f
            public final void b() {
                String unused = q.f25945z;
                q.this.getListener().b_(q.this);
            }

            @Override // com.inmobi.media.f
            public final void a() {
                String unused = q.f25945z;
                q.this.getListener().a_(q.this);
                q.this.c(null, null, null);
            }
        };
        this.az = new hm() { // from class: com.inmobi.media.q.5
            @Override // com.inmobi.media.hm
            public final void a() {
                q.this.getListener().a_();
            }

            @Override // com.inmobi.media.hm
            public final void b(String str3, String str4, String str5) {
                q.this.c(str3, str4, str5);
            }

            @Override // com.inmobi.media.hm
            public final void a(String str3, String str4, String str5) {
                q.this.b(str3, str4, str5);
            }

            @Override // com.inmobi.media.hm
            public final void a(Intent intent) {
                InMobiAdActivity.a(q.this);
                ho.a(q.this.getContainerContext(), intent);
            }
        };
        this.aA = new ec.a() { // from class: com.inmobi.media.q.6
            @Override // com.inmobi.media.ec.a
            public final void a(View view, Object obj) {
                if (view instanceof q) {
                    q.this.h();
                }
            }
        };
        this.aC = new j.a() { // from class: com.inmobi.media.q.9
            @Override // com.inmobi.media.j.a
            public final void a() {
                String unused = q.f25945z;
                q.this.getListener().a();
            }

            @Override // com.inmobi.media.j.a
            public final void b(Object obj) {
                String unused = q.f25945z;
                if (q.this.f25955e != 0) {
                    if (CBLocation.LOCATION_DEFAULT.equals(q.this.f25954d)) {
                        q.this.setAndUpdateViewState("Hidden");
                    }
                } else {
                    q.this.setAndUpdateViewState(CBLocation.LOCATION_DEFAULT);
                    if (q.this.B != null) {
                        q.this.B.setAndUpdateViewState(CBLocation.LOCATION_DEFAULT);
                    }
                }
                q.this.getListener().b_(q.this);
            }

            @Override // com.inmobi.media.j.a
            public final void a(Object obj) {
                String unused = q.f25945z;
                if (q.this.f25955e == 0) {
                    if (q.this.B != null) {
                        q.this.B.setAndUpdateViewState("Expanded");
                    } else {
                        q.this.setAndUpdateViewState("Expanded");
                    }
                    q.j(q.this);
                }
                q.this.getListener().a_(q.this);
            }
        };
        this.aD = new WebChromeClient() { // from class: com.inmobi.media.q.10
            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                consoleMessage.message();
                consoleMessage.lineNumber();
                consoleMessage.sourceId();
                String unused = q.f25945z;
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onGeolocationPermissionsShowPrompt(final String str3, final GeolocationPermissions.Callback callback) {
                if (q.this.f25952b != null && q.this.f25952b.get() != null) {
                    new AlertDialog.Builder((Context) q.this.f25952b.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.inmobi.media.q.10.7
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            callback.invoke(str3, true, false);
                        }
                    }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: com.inmobi.media.q.10.6
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            callback.invoke(str3, false, false);
                        }
                    }).create().show();
                }
                super.onGeolocationPermissionsShowPrompt(str3, callback);
            }

            @Override // android.webkit.WebChromeClient
            public final void onHideCustomView() {
                a();
                super.onHideCustomView();
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView, String str3, String str4, final JsResult jsResult) {
                String unused = q.f25945z;
                if (q.a(q.this, jsResult)) {
                    Activity fullScreenActivity = q.this.getFullScreenActivity();
                    if (fullScreenActivity != null) {
                        new AlertDialog.Builder(fullScreenActivity).setMessage(str4).setTitle(str3).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.inmobi.media.q.10.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                jsResult.confirm();
                            }
                        }).setCancelable(false).create().show();
                        return true;
                    }
                    jsResult.cancel();
                    return true;
                }
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView, String str3, String str4, final JsResult jsResult) {
                String unused = q.f25945z;
                if (q.a(q.this, jsResult)) {
                    Activity fullScreenActivity = q.this.getFullScreenActivity();
                    if (fullScreenActivity != null) {
                        new AlertDialog.Builder(fullScreenActivity).setMessage(str4).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.inmobi.media.q.10.3
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                jsResult.confirm();
                            }
                        }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: com.inmobi.media.q.10.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                jsResult.cancel();
                            }
                        }).create().show();
                        return true;
                    }
                    jsResult.cancel();
                    return true;
                }
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView, String str3, String str4, String str5, JsPromptResult jsPromptResult) {
                String unused = q.f25945z;
                if (q.a(q.this, jsPromptResult)) {
                    if (q.this.getFullScreenActivity() == null) {
                        jsPromptResult.cancel();
                        return true;
                    }
                    return false;
                }
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                if (q.this.f25952b == null || q.this.f25952b.get() == null) {
                    return;
                }
                q.this.O = view;
                q.this.P = customViewCallback;
                q.this.O.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.q.10.4
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        return true;
                    }
                });
                q.this.O.setBackgroundColor(-16777216);
                ((FrameLayout) ((Activity) q.this.f25952b.get()).findViewById(16908290)).addView(q.this.O, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
                q.this.O.requestFocus();
                View view2 = q.this.O;
                view2.setOnKeyListener(new View.OnKeyListener() { // from class: com.inmobi.media.q.10.5
                    @Override // android.view.View.OnKeyListener
                    public final boolean onKey(View view3, int i10, KeyEvent keyEvent) {
                        if (4 == keyEvent.getKeyCode() && keyEvent.getAction() == 0) {
                            String unused = q.f25945z;
                            a();
                            return true;
                        }
                        return false;
                    }
                });
                view2.setFocusable(true);
                view2.setFocusableInTouchMode(true);
                view2.requestFocus();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a() {
                if (q.this.O == null) {
                    return;
                }
                if (q.this.P != null) {
                    q.this.P.onCustomViewHidden();
                    q.this.P = null;
                }
                if (q.this.O == null || q.this.O.getParent() == null) {
                    return;
                }
                ((ViewGroup) q.this.O.getParent()).removeView(q.this.O);
                q.this.O = null;
            }
        };
        this.f25975y = new bh() { // from class: com.inmobi.media.q.11
            @Override // com.inmobi.media.bh
            public final void a(aw awVar, byte b11) {
                if (awVar.f24652f == null || awVar.f24647a.size() <= 0) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(ImagesContract.URL, awVar.f24647a.get(0).f24630d);
                    jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, (int) awVar.f24647a.get(0).f24638l);
                } catch (JSONException unused) {
                }
                String unused2 = q.f25945z;
                q.this.a(awVar.f24652f, "sendSaveContentResult(\"saveContent_" + awVar.f24653g + "\", 'failed', \"" + jSONObject.toString().replace("\"", "\\\"") + "\");");
            }

            @Override // com.inmobi.media.bh
            public final void a(aw awVar) {
                if (awVar.f24652f == null || awVar.f24647a.size() <= 0) {
                    return;
                }
                String unused = q.f25945z;
                q.this.a(awVar.f24652f, "sendSaveContentResult(\"saveContent_" + awVar.f24653g + "\", 'success', \"" + awVar.f24647a.get(0).f24637k + "\");");
            }
        };
        this.B = null;
        this.f25955e = b10;
        this.f25968r = false;
        this.f25950ae = set;
        this.f25969s = str;
        setReferenceContainer(this);
        this.V = this;
        this.ah = true;
        this.f25953c = bool.booleanValue();
        this.ax = str2;
        this.ar = new z(this);
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.as = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b10 == 1);
        this.au = new dd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getAdFrameRect() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        int[] iArr2 = this.am;
        int i11 = i10 + iArr2[0];
        int i12 = iArr[1] + iArr2[1];
        int[] iArr3 = this.am;
        return new Rect(i11, i12, iArr3[2] + i11, iArr3[3] + i12);
    }

    static /* synthetic */ boolean j(q qVar) {
        qVar.f25968r = false;
        return false;
    }

    private void o() {
        r();
        q();
        p();
    }

    private void p() {
        byte b10;
        if (this.T != null) {
            b10 = this.E.viewability.banner.impressionType;
        } else {
            b10 = this.E.viewability.interstitial.impressionType;
        }
        this.A = b10;
    }

    private void q() {
        if (DownloadResource.TYPE_VIDEO.equals(this.f25974x)) {
            this.aq = this.E.viewability.video.impressionMinPercentageViewed;
        } else {
            this.aq = this.E.viewability.web.impressionMinPercentageViewed;
        }
    }

    private void r() {
        if (DownloadResource.TYPE_VIDEO.equals(this.f25974x)) {
            this.ap = this.E.viewability.video.impressionMinTimeViewed;
        } else {
            this.ap = this.E.viewability.web.impressionMinTimeViewed;
        }
    }

    private void s() {
        InMobiAdActivity.a((Object) this);
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            k kVar = this.f25972v;
            if (kVar == null || !kVar.b(this)) {
                ((InMobiAdActivity) fullScreenActivity).f24414b = true;
                fullScreenActivity.finish();
                int i10 = this.Q;
                if (i10 != -1) {
                    fullScreenActivity.overridePendingTransition(0, i10);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f25955e == 0) {
            setAndUpdateViewState(CBLocation.LOCATION_DEFAULT);
            q qVar = this.B;
            if (qVar != null) {
                qVar.setAndUpdateViewState(CBLocation.LOCATION_DEFAULT);
            }
        } else if (CBLocation.LOCATION_DEFAULT.equals(this.f25954d)) {
            setAndUpdateViewState("Hidden");
        }
        getListener().b_(this);
    }

    private void t() {
        setVisibility(0);
        requestLayout();
    }

    public final void b(String str) {
        this.f25968r = false;
        if (this.f25967q.get()) {
            return;
        }
        loadUrl(str);
    }

    @Override // android.webkit.WebView, com.inmobi.media.j
    @TargetApi(11)
    public final void destroy() {
        if (this.f25967q.get()) {
            return;
        }
        if (!this.K) {
            this.K = true;
            return;
        }
        this.f25967q.set(true);
        this.f25968r = true;
        this.Q = -1;
        removeJavascriptInterface("sdkController");
        WeakReference<Activity> weakReference = this.f25952b;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference<ViewGroup> weakReference2 = this.C;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        dw dwVar = this.f25951af;
        if (dwVar != null) {
            dwVar.d();
            this.f25951af.e();
        }
        this.aw = null;
        this.D = null;
        this.f25972v = null;
        this.V = null;
        ViewParent parent = getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this);
            removeAllViews();
        }
        fq.h hVar = this.E.viewability.omidConfig;
        if (this.ah && hVar.omidEnabled && er.a.f25286a.a()) {
            final fm fmVar = new fm(this, hVar.webViewRetainTime);
            new Handler().postDelayed(new Runnable() { // from class: com.inmobi.media.fp.1
                @Override // java.lang.Runnable
                public final void run() {
                    fp fpVar = fmVar;
                    fpVar.a(fpVar.f25479a);
                    fmVar.f25479a = null;
                }
            }, fmVar.f25480b);
            return;
        }
        super.destroy();
    }

    @Override // com.inmobi.media.j
    public final fq getAdConfig() {
        return this.E;
    }

    public final k getAdPodHandler() {
        return this.f25972v;
    }

    public final boolean getAllowAutoRedirection() {
        return this.W;
    }

    public final Context getContainerContext() {
        WeakReference<Activity> weakReference = this.f25952b;
        if (weakReference != null && weakReference.get() != null) {
            return this.f25952b.get();
        }
        return getContext();
    }

    public final String getContentUrl() {
        return this.al;
    }

    public final String getCreativeId() {
        return this.U;
    }

    public final String getCurrentPosition() {
        JSONObject jSONObject = this.J;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public final Object getCurrentPositionMonitor() {
        return this.M;
    }

    public final int getCurrentRenderingPodAdIndex() {
        k kVar = this.f25972v;
        if (kVar != null) {
            return kVar.a(this);
        }
        return 0;
    }

    @Override // com.inmobi.media.j
    public final Object getDataModel() {
        return null;
    }

    public final String getDefaultPosition() {
        JSONObject jSONObject = this.I;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public final Object getDefaultPositionMonitor() {
        return this.L;
    }

    public final w getEmbeddedBrowserJSCallbacks() {
        return this.aw;
    }

    public final cx getExpandProperties() {
        return this.G;
    }

    public final Activity getFullScreenActivity() {
        WeakReference<Activity> weakReference = this.f25952b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.inmobi.media.j
    public final j.a getFullScreenEventsListener() {
        return this.aC;
    }

    public final String getImpressionId() {
        return this.f25969s;
    }

    public final byte getImpressionType() {
        return this.A;
    }

    public final m getLandingPageHandler() {
        return this.at;
    }

    public final String getLandingScheme() {
        return this.ax;
    }

    public final s getListener() {
        s sVar = this.D;
        if (sVar == null) {
            s sVar2 = f25944a;
            this.D = sVar2;
            return sVar2;
        }
        return sVar;
    }

    @Override // com.inmobi.media.j
    public final String getMarkupType() {
        return this.f25947ab;
    }

    public final db getMediaProcessor() {
        return this.f25958h;
    }

    public final fq.g getMraidConfig() {
        return this.E.mraid;
    }

    public final String getMraidJsString() {
        String b10 = new hx(getContext(), "mraid_js_store").b("mraid_js_string");
        return b10 == null ? "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){this.event=a;this.count=0;var b=[];this.add=function(a){b.push(a);++this.count};this.remove=function(a){var e=!1,d=this;b=b.filter(function(b){if(b=b===a)--d.count,e=!0;return!b});return e};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){b.forEach(function(b){try{b.apply({},a)}catch(d){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});\nreturn c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners);c[a].add(b);\"micIntensityChange\"==a&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&\nwindow.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(e){this.log(e)}};this.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&\nwindow.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==a&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};\nthis.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{this.listeners[c]&&this.listeners[c].broadcast(b)}catch(e){}}};this.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var e=arguments[c],e=JSON.parse(e);b[c]=e}else b[c]=arguments[c];e=b[1];\"success\"!=e&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);\nwindow.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;window.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){e={};e.command=a;e.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b[arguments[c]]=\"\"+d);e.params=b}else for(var e=this.urlScheme+\"://\"+a,d,b=!0,c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b?(e+=\"?\",b=!1):e+=\"&\",e+=arguments[c]+\"=\"+escape(d));__im__iosNativeCall.executeNativeCall(e);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(b){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(b);return!1};a.popupBlocked=function(b){a.firePopupBlockedBeacon(b)};a.zeroPad=function(a){var b=\"\";10>a&&(b+=\"0\");return b+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"use CustomClose: \"+b)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,d){c?b.push(a):(eval(a),d&&(c=!0))};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(b){try{b?this.props=b:b=null;if(\"undefined\"!=typeof b.lockOrientation&&null!=b.lockOrientation&&\"undefined\"!=typeof b.orientation&&null!=b.orientation){var c={};c.allowOrientationChange=!b.lockOrientation;c.forceOrientation=b.orientation;a.setOrientationProperties(c)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(b))}catch(f){imraidview.showAlert(\"executeNativesetExpandProperties: \"+f+\", props = \"+b)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(a.orientationProperties.forceOrientation=b.forceOrientation)):b=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(c){imraidview.showAlert(\"setOrientationProperties: \"+\nc+\", props = \"+b)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;a.setResizeProperties=function(b){var c,f;try{c=parseInt(b.width);f=parseInt(b.height);if(isNaN(c)||isNaN(f)||1>c||1>f)throw\"Invalid\";b.width=c;b.height=f;a.resizeProps=b;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(b))}catch(g){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\n\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+sdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getResizeProperties: \"+b)}};a.open=function(b){\"undefined\"==typeof b&&(b=null);try{sdkController.open(\"window.mraidview\",b)}catch(a){imraidview.showAlert(\"open: \"+a)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getScreenSize: \"+b)}};a.getMaxSize=\nfunction(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getMaxSize: \"+b)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getCurrentPosition: \"+b)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(b){imraidview.showAlert(\"getDefaultPosition: \"+b)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(b){imraidview.showAlert(\"getState: \"+\nb)}};a.isViewable=function(){try{return sdkController.isViewable(\"window.mraidview\")}catch(b){imraidview.showAlert(\"isViewable: \"+b)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(b){imraidview.showAlert(\"close: \"+b)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(b){return 0==this.indexOf(b)});a.playVideo=function(b){var a=\"\";null!=b&&(a=b);try{sdkController.playVideo(\"window.mraidview\",\na)}catch(c){imraidview.showAlert(\"playVideo: \"+c)}};a.stringify=function(b){if(\"undefined\"===typeof JSON){var c=\"\",f;if(\"undefined\"==typeof b.length)return a.stringifyArg(b);for(f=0;f<b.length;f++)0<f&&(c+=\",\"),c+=a.stringifyArg(b[f]);return c+\"]\"}return JSON.stringify(b)};a.stringifyArg=function(b){var a,c,g;c=typeof b;a=\"\";if(\"number\"===c||\"boolean\"===c)a+=args;else if(b instanceof Array)a=a+\"[\"+b+\"]\";else if(b instanceof Object){c=!0;a+=\"{\";for(g in b)null!==b[g]&&(c||(a+=\",\"),a=a+'\"'+g+'\":',c=\ntypeof b[g],a=\"number\"===c||\"boolean\"===c?a+b[g]:\"function\"===typeof b[g]?a+'\"\"':b[g]instanceof Object?a+this.stringify(args[i][g]):a+'\"'+b[g]+'\"',c=!1);a+=\"}\"}else b=b.replace(/\\\\/g,\"\\\\\\\\\"),b=b.replace(/\"/g,'\\\\\"'),a=a+'\"'+b+'\"';imraidview.showAlert(\"json:\"+a);return a};getPID=function(b){var a=\"\";null!=b&&(\"undefined\"!=typeof b.id&&null!=b.id)&&(a=b.id);return a};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\n\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(b){imraidview.showAlert(\"resize called in bridge\")}};a.storePicture=function(b){console.log(\"bridge: storePicture\");if(\"string\"!=typeof b)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled by user.\",\"storePicture\"),\n!1):sdkController.storePicture(\"window.mraidview\",b);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(b,a){};a.fireMediaErrorEvent=function(b,a){};a.fireMediaTimeUpdateEvent=function(b,a,c){};a.fireMediaCloseEvent=function(b,a,c){};a.fireMediaVolumeChangeEvent=function(b,a,c){};a.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;c.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,c)}};b.firePopupBlockedBeacon=function(b){if(\"undefined\"!=typeof inmobi&&\ninmobi.recordEvent){var a={};a.trigger=b;inmobi.recordEvent(136,a)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=b.getExpandProperties;a.setExpandProperties=function(c){\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(c.useCustomClose);\nb.setExpandProperties(c)};a.getResizeProperties=b.getResizeProperties;a.setResizeProperties=b.setResizeProperties;a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=b.expand;a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(b){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?\na.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c))};a.resize=b.resize;a.getVersion=function(){return\"2.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)}})();\n(function(){var a=window.imraidview={};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(mraidview.orientationProperties.forceOrientation=b.forceOrientation),\"undefined\"!=typeof b.direction&&(mraidview.orientationProperties.direction=b.direction)):b=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(c){a.showAlert(\"setOrientationProperties: \"+\nc+\", props = \"+b)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(b){window.imraid.broadcastEvent(\"postStatus\",b)};a.fireMediaTrackingEvent=function(b,a){var e={};e.name=b;var d=\"inmobi_media_\"+b;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(d=d+\"_\"+a);window.imraid.broadcastEvent(d,e)};a.fireMediaErrorEvent=function(b,a){var e={name:\"error\"};e.code=a;var d=\"inmobi_media_\"+e.name;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(d=d+\"_\"+b);window.imraid.broadcastEvent(d,\ne)};a.fireMediaTimeUpdateEvent=function(b,a,e){var d={name:\"timeupdate\",target:{}};d.target.currentTime=a;d.target.duration=e;a=\"inmobi_media_\"+d.name;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(a=a+\"_\"+b);window.imraid.broadcastEvent(a,d)};a.saveContent=function(b,a,e){window.imraid.addEventListener(\"saveContent_\"+b,e);sdkController.saveContent(\"window.imraidview\",b,a)};a.cancelSaveContent=function(b){sdkController.cancelSaveContent(\"window.imraidview\",b)};a.disableCloseRegion=function(b){sdkController.disableCloseRegion(\"window.imraidview\",\nb)};a.fireGalleryImageSelectedEvent=function(b,a,e){var d=new Image;d.src=\"data:image/jpeg;base64,\"+b;d.width=a;d.height=e;window.imraid.broadcastEvent(\"galleryImageSelected\",d)};a.fireCameraPictureCatpturedEvent=function(b,a,e){var d=new Image;d.src=\"data:image/jpeg;base64,\"+b;d.width=a;d.height=e;window.imraid.broadcastEvent(\"cameraPictureCaptured\",d)};a.fireMediaCloseEvent=function(b,a,e){var d={name:\"close\"};d.viaUserInteraction=a;d.target={};d.target.currentTime=e;a=\"inmobi_media_\"+d.name;\"undefined\"!=\ntypeof b&&(null!=b&&\"\"!=b)&&(a=a+\"_\"+b);window.imraid.broadcastEvent(a,d)};a.fireMediaVolumeChangeEvent=function(b,a,e){var d={name:\"volumechange\",target:{}};d.target.volume=a;d.target.muted=e;a=\"inmobi_media_\"+d.name;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(a=a+\"_\"+b);window.imraid.broadcastEvent(a,d)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=\nfunction(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(b,c){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",b,c):sdkController.openExternal(\"window.imraidview\",b)}catch(e){a.showAlert(\"openExternal: \"+e)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",\nb)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};a.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};\na.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=function(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,e=\"\",d=0;d<c;d++)e+=b[d];return parseInt(e)};a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");\nif(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,e,d){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",\nJSON.stringify(a))}catch(c){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=function(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+\nc+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};a.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,\narguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):sdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};\na.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,c,e){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,c,e)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&\nsdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&\nsdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,c){700<=getSdkVersionInt()&&sdkController.getBlob(a,c)};a.setCloseEndCardTracker=function(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=\nfunction(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(c){}};a.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};\na.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(c){}};a.setAdContext=function(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(c){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==\ntypeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(c){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpand=function(b,c,e,d,f){try{void 0==e||\"number\"!=typeof e?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):void 0==d||\"boolean\"!=typeof d?console.log(\"topNavBarVisible called with invalid params\"):void 0==f||\"boolean\"!=typeof f?\nconsole.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,e,d,f)}catch(g){a.showAlert(\"executeNativeCustomExpand: \"+g+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+e+\", bottomNavBarVisible = \"+f+\", topNavBarVisible = \"+d)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};a.onGestureDetected=function(a,c){window.imraid.broadcastEvent(\"onGestureDetected\",a,c)};a.onUserLandingCompleted=\nfunction(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,e,d){var f=arguments.length,g,h=null;if(3>f){if(\"function\"===typeof arguments[f-1])g=arguments[f-1];else return;h={reason:1}}else a.saveContentIDMap[c]&&(g=arguments[2],h={reason:11,url:arguments[1]});\"function\"!==!g&&(h?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,g),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(h))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,e,d)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,e){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,e)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,e,d,f){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,e,d,f)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a,e,d,f,g,h,k,l){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a,e,d,f,g,h,k,l)};a.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=\nfunction(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};a.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=\nb.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;a.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;\na.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(e){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var d=-1;try{d=a.indexOf(b)}catch(f){}return d};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,e,d){if(!imIsObjValid(e)||!imIsObjValid(d))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+e+\",\"+d):a+(\"&u-tap-o=\"+e+\",\"+d));return a};b.performAdClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,f=a.landingConfig;if(!imIsObjValid(d)&&!imIsObjValid(f))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,l=null,n=null,m=null,q=null,p=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(r){n=\nl=0}imIsObjValid(f)?imIsObjValid(d)?(m=f.url,q=f.fallbackUrl,p=f.urlType,g=d.url,h=d.pingWV,k=d.fr):(m=f.url,p=f.urlType):(m=d.url,p=d.urlType);d=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"number\"!=typeof p||null==p)p=0;g=b.appendTapParams(g,l,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(m))switch(imIsObjValid(g)||\n(m=b.appendTapParams(m,l,n)),p){case 1:b.openEmbedded(m);break;case 2:\"ios\"==d?b.ios.openItunesProductView(m):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+d);break;default:b.openExternal(m,q)}else b.log(\"Landing url provided is null.\")}catch(s){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,f=a.landingConfig;\nif(!imIsObjValid(d)&&!imIsObjValid(f))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var g=null,h=null,k=null,l=null,n=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(m){n=l=0}imIsObjValid(d)&&(g=d.url,h=d.pingWV,k=d.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=\n!0;if(0>h||1<h)h=!0;g=b.appendTapParams(g,l,n);imIsObjValid(g)?!0==h?b.pingInWebView(g,k):b.ping(g,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(f)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,e){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,e)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();\n" : b10;
    }

    public final dd getOrientationProperties() {
        return this.au;
    }

    public final q getOriginalRenderView() {
        return this.B;
    }

    public final long getPlacementId() {
        return this.S;
    }

    @Override // com.inmobi.media.j
    public final byte getPlacementType() {
        return this.f25955e;
    }

    public final j getReferenceContainer() {
        return this.V;
    }

    public final JSONArray getRenderableAdIndexes() {
        k kVar = this.f25972v;
        if (kVar != null) {
            return kVar.c();
        }
        return new JSONArray();
    }

    public final fq.i getRenderingConfig() {
        return this.E.rendering;
    }

    public final de getResizeProperties() {
        return this.H;
    }

    public final long getShowTimeStamp() {
        k kVar = this.f25972v;
        if (kVar != null) {
            return kVar.d();
        }
        return 0L;
    }

    public final String getState() {
        return this.f25954d;
    }

    @Override // com.inmobi.media.j
    public final View getVideoContainerView() {
        return null;
    }

    public final String getViewState() {
        return this.f25954d;
    }

    @Override // com.inmobi.media.j
    @SuppressLint({"SwitchIntDef"})
    public final dw getViewableAd() {
        dw dxVar;
        if (this.f25951af == null) {
            if (this.f25949ad != null) {
                ec ecVar = this.f25949ad;
                dx dxVar2 = new dx(this);
                int i10 = this.aq;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = getAdConfig().viewability.web.impressionMinPercentageViewed;
                }
                int i11 = i10;
                int i12 = this.ap;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = getAdConfig().viewability.web.impressionMinTimeViewed;
                }
                dxVar = new ed(this, ecVar, dxVar2, i11, i12);
            } else {
                dxVar = new dx(this);
            }
            this.f25951af = dxVar;
            Set<du> set = this.f25950ae;
            if (set != null) {
                for (du duVar : set) {
                    try {
                        if (duVar.f25178a == 3) {
                            ek ekVar = (ek) duVar.f25179b.get("omidAdSession");
                            boolean z10 = duVar.f25179b.containsKey("deferred") && ((Boolean) duVar.f25179b.get("deferred")).booleanValue();
                            String str = (String) duVar.f25179b.get("customReferenceData");
                            if (z10) {
                                ekVar.a(eo.a(this, getContentUrl(), str));
                            }
                            if (ekVar != null) {
                                this.f25951af = new eo(this, this.f25951af, ekVar);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return this.f25951af;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = isHardwareAccelerated();
        if (this.C == null) {
            this.C = new WeakReference<>((ViewGroup) getParent());
        }
        if (this.ai && this.ag) {
            final jg jgVar = new jg(this, this);
            final long b10 = getListener().c_().b();
            final TimerTask timerTask = new TimerTask() { // from class: com.inmobi.media.jg.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    a aVar = (a) jgVar.f25851c.get();
                    if (jgVar.f25853e) {
                        return;
                    }
                    jg.c(jgVar);
                    if (aVar != null) {
                        aVar.k();
                    }
                }
            };
            View view = jgVar.f25850a.get();
            if (view != null) {
                view.post(new Runnable() { // from class: com.inmobi.media.jg.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        final a aVar = (a) jgVar.f25851c.get();
                        final Timer timer = new Timer(jg.f25849b);
                        timer.schedule(timerTask, b10);
                        new Thread(new Runnable() { // from class: com.inmobi.media.jg.2.1
                            {
                                AnonymousClass2.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                do {
                                    try {
                                        try {
                                            View view2 = (View) jgVar.f25850a.get();
                                            if (view2 != null) {
                                                Bitmap b11 = jg.b(view2);
                                                if (b11 != null) {
                                                    int width = b11.getWidth() * b11.getHeight();
                                                    int[] iArr = new int[width];
                                                    b11.getPixels(iArr, 0, b11.getWidth(), 0, 0, b11.getWidth(), b11.getHeight());
                                                    int i10 = 0;
                                                    while (true) {
                                                        if (i10 >= width) {
                                                            break;
                                                        }
                                                        int i11 = iArr[i10];
                                                        if (i11 <= -16777216 || i11 >= 0) {
                                                            i10++;
                                                        } else {
                                                            String unused = jg.f25849b;
                                                            jg.e(jgVar);
                                                            timer.cancel();
                                                            a aVar2 = aVar;
                                                            if (aVar2 != null) {
                                                                aVar2.j();
                                                            }
                                                        }
                                                    }
                                                    if (!jgVar.f25853e) {
                                                        Thread.sleep(200L);
                                                    }
                                                }
                                            } else {
                                                String unused2 = jg.f25849b;
                                                timer.cancel();
                                                a aVar3 = aVar;
                                                if (aVar3 != null) {
                                                    aVar3.k();
                                                }
                                            }
                                        } catch (IllegalStateException unused3) {
                                            a aVar4 = aVar;
                                            if (aVar4 != null) {
                                                aVar4.k();
                                            }
                                        }
                                        if (jgVar.f25852d) {
                                            return;
                                        }
                                    } catch (InterruptedException unused4) {
                                        a aVar5 = aVar;
                                        if (aVar5 != null) {
                                            aVar5.k();
                                            return;
                                        }
                                        return;
                                    }
                                } while (!jgVar.f25853e);
                            }
                        }).start();
                    }
                });
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.av.a();
        getMediaProcessor().b();
        getMediaProcessor().c();
        getMediaProcessor().e();
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (getRenderingConfig().gestures.contains(1)) {
            this.f25946aa = SystemClock.elapsedRealtime();
            if (motionEvent.getAction() == 1) {
                JSONArray jSONArray = new JSONArray();
                try {
                    jSONArray.put(motionEvent.getX());
                    jSONArray.put(motionEvent.getY());
                } catch (JSONException unused) {
                }
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(jSONArray);
                d("window.imraidview.onGestureDetected('1', '" + jSONArray2.toString() + "');");
            }
            return false;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (getRenderingConfig().gestures.contains(5)) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(motionEvent.getX());
                jSONArray.put(motionEvent.getY());
            } catch (JSONException unused) {
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            d("window.imraidview.onGestureDetected('5', '" + jSONArray2.toString() + "');");
        }
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (i10 == 0) {
            e(false);
        } else if (this.R) {
        } else {
            e(true);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (getRenderingConfig().gestures.contains(0)) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(motionEvent.getX());
                jSONArray.put(motionEvent.getY());
            } catch (JSONException unused) {
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            d("window.imraidview.onGestureDetected('0', '" + jSONArray2.toString() + "');");
            return false;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f25946aa = SystemClock.elapsedRealtime();
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == 0 || i11 == 0) {
            return;
        }
        int b10 = ic.b(i10);
        int b11 = ic.b(i11);
        d("window.mraidview.broadcastEvent('sizeChange'," + b10 + "," + b11 + ");");
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f25955e == 1) {
            z zVar = this.ar;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                zVar.f26021e = motionEvent.getPointerId(motionEvent.getActionIndex());
                zVar.f26024h = new JSONArray();
                zVar.f26024h.put(new JSONArray((Collection) Arrays.asList(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()))));
            } else if (actionMasked == 1) {
                zVar.f26021e = -1;
                if (zVar.f26024h.length() > 5) {
                    zVar.f26027k.a(zVar);
                    zVar.f26024h = new JSONArray();
                }
            } else if (actionMasked == 2) {
                int i10 = zVar.f26021e;
                if (i10 != -1 && zVar.f26022f != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    int findPointerIndex2 = motionEvent.findPointerIndex(zVar.f26022f);
                    if (findPointerIndex >= 0) {
                        float x10 = motionEvent.getX(findPointerIndex);
                        f11 = motionEvent.getY(findPointerIndex);
                        f10 = x10;
                    } else {
                        gg a10 = gg.a();
                        a10.a(new hg(new IllegalArgumentException("Index for mPtrID1=" + zVar.f26021e + " is" + findPointerIndex + " | Pointer count=" + motionEvent.getPointerCount())));
                        f10 = 0.0f;
                        f11 = 0.0f;
                    }
                    if (findPointerIndex2 >= 0) {
                        float x11 = motionEvent.getX(findPointerIndex2);
                        f13 = motionEvent.getY(findPointerIndex2);
                        f12 = x11;
                    } else {
                        gg a11 = gg.a();
                        a11.a(new hg(new IllegalArgumentException("Index for mPtrID1=" + zVar.f26022f + " is" + findPointerIndex2 + " | Pointer count=" + motionEvent.getPointerCount())));
                        f12 = 0.0f;
                        f13 = 0.0f;
                    }
                    zVar.f26023g = Math.abs(z.a(zVar.f26017a, zVar.f26018b, zVar.f26019c, zVar.f26020d, f12, f13, f10, f11));
                } else if (i10 != -1 && zVar.f26024h.length() > 0 && zVar.f26024h.length() < 50) {
                    try {
                        float x12 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        JSONArray jSONArray = zVar.f26024h;
                        JSONArray jSONArray2 = jSONArray.getJSONArray(jSONArray.length() - 1);
                        JSONArray jSONArray3 = new JSONArray((Collection) Arrays.asList(Float.valueOf(x12), Float.valueOf(y10)));
                        if (z.a(jSONArray2.getInt(0), jSONArray3.getInt(0), jSONArray2.getInt(1), jSONArray3.getInt(1)) > 100) {
                            zVar.f26024h.put(jSONArray3);
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (actionMasked == 3) {
                zVar.f26021e = -1;
                zVar.f26022f = -1;
            } else if (actionMasked == 5) {
                zVar.f26022f = motionEvent.getPointerId(motionEvent.getActionIndex());
                zVar.f26025i = MotionEvent.obtain(motionEvent);
                int findPointerIndex3 = motionEvent.findPointerIndex(zVar.f26021e);
                int findPointerIndex4 = motionEvent.findPointerIndex(zVar.f26022f);
                if (findPointerIndex3 >= 0) {
                    zVar.f26019c = motionEvent.getX(findPointerIndex3);
                    zVar.f26020d = motionEvent.getY(findPointerIndex3);
                } else {
                    gg a12 = gg.a();
                    a12.a(new hg(new IllegalArgumentException("Index for mPtrID1=" + zVar.f26021e + " is" + findPointerIndex3 + " | Pointer count=" + motionEvent.getPointerCount())));
                }
                if (findPointerIndex4 >= 0) {
                    zVar.f26017a = motionEvent.getX(findPointerIndex4);
                    zVar.f26018b = motionEvent.getY(findPointerIndex4);
                } else {
                    gg a13 = gg.a();
                    a13.a(new hg(new IllegalArgumentException("Index for mPtrID2=" + zVar.f26022f + " is" + findPointerIndex4 + " | Pointer count=" + motionEvent.getPointerCount())));
                }
                zVar.f26026j = z.a(zVar.f26019c, zVar.f26017a, zVar.f26020d, zVar.f26018b);
            } else if (actionMasked == 6) {
                zVar.f26022f = -1;
                if (zVar.f26023g > 30.0f) {
                    zVar.f26027k.a(zVar.f26025i, motionEvent);
                    zVar.f26023g = 0.0f;
                }
                if (Math.abs(z.a(motionEvent.getX(), motionEvent.getX(1), motionEvent.getY(), motionEvent.getY(1)) - zVar.f26026j) > 500) {
                    zVar.f26027k.a(motionEvent);
                    zVar.f26026j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
            }
        }
        this.as.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view instanceof q) {
            f(i10 == 0);
        } else {
            f(false);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.R = !z10;
        if (z10) {
            if (isShown()) {
                eb.a aVar = aB;
                if (aVar.a(this, this, getAdConfig().viewability.web.impressionMinPercentageViewed, null) && aVar.a(this, this, getAdConfig().viewability.web.impressionMinPercentageViewed)) {
                    z10 = true;
                }
            }
            z10 = false;
        }
        e(z10);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        f(i10 == 0);
    }

    public final void setAdPodHandler(k kVar) {
        this.f25972v = kVar;
    }

    public final void setAdSize(String str) {
        this.T = str;
        this.ak = ic.a(Integer.parseInt(str.split("x")[0]));
        int a10 = ic.a(Integer.parseInt(str.split("x")[1]));
        this.aj = a10;
        this.an = a10 * this.ak;
    }

    public final void setAllowAutoRedirection(boolean z10) {
        this.W = z10;
    }

    public final void setAndUpdateViewState(String str) {
        this.f25954d = str;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        d("window.mraidview.broadcastEvent('stateChange','" + lowerCase + "');");
    }

    public final void setBlobProvider(ai aiVar) {
        this.f25970t = aiVar;
    }

    public final void setCloseEndCardTracker(String str) {
        fk fkVar;
        cg cgVar;
        j referenceContainer = getReferenceContainer();
        if (!(referenceContainer instanceof o) || (fkVar = (fk) ((o) referenceContainer).getVideoContainerView()) == null || (cgVar = (cg) fkVar.getVideoView().getTag()) == null || cgVar.b() == null || cgVar.b().f() == null) {
            return;
        }
        cgVar.b().f().a(new cf(str, 0, "closeEndCard", null));
    }

    public final void setCloseRegionDisabled(boolean z10) {
        this.f25964n = z10;
    }

    public final void setContentUrl(String str) {
        this.al = str;
    }

    public final void setCreativeId(String str) {
        this.U = str;
    }

    public final void setDisableBackButton(boolean z10) {
        this.f25965o = z10;
    }

    public final void setEmbeddedBrowserJSCallbacks(w wVar) {
        this.aw = wVar;
    }

    public final void setExitAnimation(int i10) {
        this.Q = i10;
    }

    public final void setExpandProperties(cx cxVar) {
        if (cxVar.f25039b) {
            setUseCustomClose(cxVar.f25038a);
        }
        this.G = cxVar;
    }

    @Override // com.inmobi.media.j
    public final void setFullScreenActivityContext(Activity activity) {
        this.f25952b = new WeakReference<>(activity);
        n();
    }

    public final void setImpressionId(String str) {
        this.f25969s = str;
    }

    public final void setIsPreload(boolean z10) {
        this.f25971u = z10;
    }

    public final void setMarkupType(String str) {
        this.f25947ab = str;
    }

    public final void setOrientationProperties(dd ddVar) {
        this.au = ddVar;
        n();
    }

    public final void setOriginalRenderView(q qVar) {
        this.B = qVar;
    }

    public final void setPlacementId(long j10) {
        this.S = j10;
    }

    public final void setReferenceContainer(j jVar) {
        this.V = jVar;
    }

    public final void setRenderViewEventListener(s sVar) {
        this.D = sVar;
    }

    public final void setResizeProperties(de deVar) {
        this.H = deVar;
    }

    public final void setScrollable(boolean z10) {
        setScrollContainer(z10);
        setVerticalScrollBarEnabled(z10);
        setHorizontalScrollBarEnabled(z10);
    }

    public final void setShouldFireRenderBeacon(boolean z10) {
        this.ai = z10;
    }

    public final void setUseCustomClose(boolean z10) {
        this.f25962l = z10;
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (this.f25967q.get()) {
            return;
        }
        super.stopLoading();
    }

    private void f(boolean z10) {
        if (this.f25963m == z10 || this.f25968r) {
            return;
        }
        this.f25963m = z10;
        if (z10) {
            getListener().f(this);
        }
        g(this.f25963m);
    }

    private void n() {
        Activity activity = this.f25952b.get();
        if (activity instanceof InMobiAdActivity) {
            ((InMobiAdActivity) activity).a(this.au);
        }
    }

    @Override // com.inmobi.media.j
    public final boolean c() {
        return this.f25967q.get();
    }

    public final void d() {
        int[] iArr = new int[2];
        this.I = new JSONObject();
        if (this.C == null) {
            this.C = new WeakReference<>((ViewGroup) getParent());
        }
        try {
            if (this.C.get() != null) {
                this.C.get().getLocationOnScreen(iArr);
                this.I.put("x", ic.b(iArr[0]));
                this.I.put("y", ic.b(iArr[1]));
                int b10 = ic.b(this.C.get().getWidth());
                int b11 = ic.b(this.C.get().getHeight());
                this.I.put("width", b10);
                this.I.put("height", b11);
            } else {
                this.I.put("x", 0);
                this.I.put("y", 0);
                this.I.put("width", 0);
                this.I.put("height", 0);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.L) {
            this.f25960j = false;
            this.L.notifyAll();
        }
    }

    public final void e() {
        this.J = new JSONObject();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        try {
            this.J.put("x", ic.b(iArr[0]));
            this.J.put("y", ic.b(iArr[1]));
            int b10 = ic.b(getWidth());
            int b11 = ic.b(getHeight());
            this.J.put("width", b10);
            this.J.put("height", b11);
        } catch (JSONException unused) {
        }
        synchronized (this.M) {
            this.f25961k = false;
            this.M.notifyAll();
        }
    }

    public final void g() {
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.U);
        hashMap.put("impressionId", getImpressionId());
        a("NetworkLoadLimitExceeded", hashMap);
    }

    public final void h() {
        if (DownloadResource.TYPE_VIDEO.equals(this.f25974x)) {
            return;
        }
        d("window.imraidview.impressionRendered();");
        getListener().i(this);
    }

    public final boolean i() {
        fq.i renderingConfig = getRenderingConfig();
        if (renderingConfig == null) {
            return false;
        }
        return !renderingConfig.autoRedirectionEnforcement || this.W || ((this.f25946aa > (-1L) ? 1 : (this.f25946aa == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - this.f25946aa) > (renderingConfig.userTouchResetTime * 1000) ? 1 : ((SystemClock.elapsedRealtime() - this.f25946aa) == (renderingConfig.userTouchResetTime * 1000) ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.jg.a
    public final void j() {
        if (this.f25967q.get()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.q.2
            @Override // java.lang.Runnable
            public final void run() {
                q.this.getListener().f();
            }
        });
    }

    @Override // com.inmobi.media.jg.a
    public final void k() {
        if (this.f25967q.get()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.q.3
            @Override // java.lang.Runnable
            public final void run() {
                q.this.getListener().g();
            }
        });
    }

    public final void l() {
        d("window.mraidview.onUserInteraction();");
        getListener().h(this);
    }

    public final void c(boolean z10) {
        cp cpVar;
        setUseCustomClose(z10);
        View rootView = getRootView();
        if (rootView == null || (cpVar = (cp) rootView.findViewById(i.f25721d)) == null) {
            return;
        }
        cpVar.setVisibility(this.f25962l ? 8 : 0);
    }

    public final void b(String str, String str2, String str3) {
        if (str == null || str3 == null) {
            return;
        }
        a(str, "broadcastEvent('error',\"" + str2 + "\", \"" + str3 + "\")");
    }

    @Override // com.inmobi.media.z.a
    public final void a(z zVar) {
        if (getRenderingConfig().gestures.contains(2)) {
            zVar.f26024h.length();
            d("window.imraidview.onGestureDetected('2', '" + zVar.f26024h.toString() + "');");
        }
    }

    private void g(boolean z10) {
        d("window.mraidview.broadcastEvent('viewableChange'," + z10 + ");");
    }

    public final void b(boolean z10) {
        cp cpVar;
        setCloseRegionDisabled(z10);
        View rootView = getRootView();
        if (rootView == null || (cpVar = (cp) rootView.findViewById(i.f25722e)) == null) {
            return;
        }
        cpVar.setVisibility(this.f25964n ? 8 : 0);
    }

    public final void c(String str, String str2, String str3) {
        d("window.imraid.broadcastEvent('onUserLandingCompleted');");
        if (str2 == null) {
            return;
        }
        a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
    }

    public final void f() {
        super.destroy();
    }

    @Override // com.inmobi.media.j
    public final void b() {
        ViewGroup viewGroup;
        View rootView;
        db dbVar = this.f25958h;
        cy cyVar = dbVar.f25073b;
        if (cyVar != null) {
            cyVar.a();
            dbVar.f25073b = null;
        }
        if ("Expanded".equals(this.f25954d)) {
            if (!CBLocation.LOCATION_DEFAULT.equals(this.f25954d)) {
                this.f25968r = true;
                cz czVar = this.f25956f;
                if (czVar.f25058a.getOriginalRenderView() == null && (viewGroup = czVar.f25060c) != null && (rootView = viewGroup.getRootView()) != null) {
                    View findViewById = rootView.findViewById(i.f25718a);
                    ((ViewGroup) czVar.f25058a.getParent()).removeView(czVar.f25058a);
                    if (findViewById != null && (findViewById.getParent() instanceof ViewGroup)) {
                        r2 = (ViewGroup) findViewById.getParent();
                    }
                    if (r2 != null) {
                        r2.removeView(findViewById);
                    }
                    czVar.f25060c.addView(czVar.f25058a, czVar.f25061d, new RelativeLayout.LayoutParams(czVar.f25060c.getWidth(), czVar.f25060c.getHeight()));
                    czVar.f25058a.t();
                }
                s();
                this.f25968r = false;
            }
            this.K = false;
        } else if ("Resized".equals(this.f25954d)) {
            if (!CBLocation.LOCATION_DEFAULT.equals(this.f25954d)) {
                this.f25968r = true;
                dc dcVar = this.f25957g;
                ViewGroup viewGroup2 = dcVar.f25088a.getParent() instanceof ViewGroup ? (ViewGroup) dcVar.f25088a.getParent() : null;
                View rootView2 = viewGroup2 == null ? null : viewGroup2.getRootView();
                View findViewById2 = rootView2 == null ? null : rootView2.findViewById(i.f25719b);
                ViewGroup viewGroup3 = dcVar.f25089b;
                View rootView3 = viewGroup3 == null ? null : viewGroup3.getRootView();
                View findViewById3 = rootView3 == null ? null : rootView3.findViewById(i.f25718a);
                ViewGroup viewGroup4 = findViewById3 == null ? null : (ViewGroup) findViewById3.getParent();
                r2 = findViewById2 != null ? (ViewGroup) findViewById2.getParent() : null;
                if (r2 != null) {
                    r2.removeView(findViewById2);
                }
                if (viewGroup4 != null) {
                    viewGroup4.removeView(findViewById3);
                }
                if (viewGroup2 != null) {
                    viewGroup2.removeView(dcVar.f25088a);
                }
                ViewGroup viewGroup5 = dcVar.f25089b;
                if (viewGroup5 != null) {
                    viewGroup5.addView(dcVar.f25088a, dcVar.f25090c, new RelativeLayout.LayoutParams(dcVar.f25089b.getWidth(), dcVar.f25089b.getHeight()));
                }
                dcVar.f25088a.t();
                setAndUpdateViewState(CBLocation.LOCATION_DEFAULT);
                getListener().b_(this);
                this.f25968r = false;
            }
        } else if (CBLocation.LOCATION_DEFAULT.equals(this.f25954d)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            if (1 == this.f25955e) {
                s();
            } else if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        k kVar = this.f25972v;
        if (kVar != null && this.f25963m) {
            kVar.a(this, this.f25952b.get());
        }
        this.av.a();
    }

    public final void c(String str) {
        d("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
        String str2 = this.T != null ? AdView.AdType.BANNER : "int";
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.U);
        hashMap.put("trigger", str);
        hashMap.put("impressionId", getImpressionId());
        hashMap.put("adType", str2);
        a("BlockAutoRedirection", hashMap);
    }

    private void e(boolean z10) {
        if (this.f25963m == z10) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 23 || getFullScreenActivity() == null || !getFullScreenActivity().isInMultiWindowMode()) {
            f(z10);
        }
    }

    @Override // com.inmobi.media.z.a
    public final void a(MotionEvent motionEvent) {
        if (getRenderingConfig().gestures.contains(4)) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONArray((Collection) Arrays.asList(Float.valueOf((motionEvent.getX() + motionEvent.getX(1)) / 2.0f), Float.valueOf((motionEvent.getY() + motionEvent.getY(1)) / 2.0f))));
            d("window.imraidview.onGestureDetected('4', '" + jSONArray.toString() + "');");
        }
    }

    @TargetApi(16)
    public final boolean e(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1886160473:
                if (str.equals("playVideo")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1647691422:
                if (str.equals("inlineVideo")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1509574865:
                if (str.equals("html5video")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1642189884:
                if (str.equals("saveContent")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
                return true;
            case 1:
            case 2:
                return this.F && this.N;
            default:
                return false;
        }
    }

    public final void d(final String str) {
        new Handler(getContainerContext().getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.inmobi.media.q.8
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (q.this.f25967q.get()) {
                        return;
                    }
                    String str2 = "javascript:try{" + str + "}catch(e){}";
                    String unused = q.f25945z;
                    if (Build.VERSION.SDK_INT >= 19) {
                        q.this.evaluateJavascript(str2, null);
                    } else {
                        q.this.loadUrl(str2);
                    }
                } catch (Exception unused2) {
                    String unused3 = q.f25945z;
                }
            }
        });
    }

    public final void d(boolean z10) {
        getCurrentRenderingPodAdIndex();
        d("window.imraidview.broadcastEvent('adShowSuccess'," + z10 + ");");
    }

    @Override // com.inmobi.media.z.a
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (getRenderingConfig().gestures.contains(3)) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONArray((Collection) Arrays.asList(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()))));
            jSONArray.put(new JSONArray((Collection) Arrays.asList(Float.valueOf(motionEvent.getX(1)), Float.valueOf(motionEvent.getY(1)))));
            jSONArray.put(new JSONArray((Collection) Arrays.asList(Float.valueOf(motionEvent2.getX()), Float.valueOf(motionEvent2.getY()))));
            jSONArray.put(new JSONArray((Collection) Arrays.asList(Float.valueOf(motionEvent2.getX(1)), Float.valueOf(motionEvent2.getY(1)))));
            d("window.imraidview.onGestureDetected('3', '" + jSONArray.toString() + "');");
        }
    }

    @Override // com.inmobi.media.cw
    public final void a(df dfVar) {
        if (!"Resized".equals(this.f25954d) || getResizeProperties() == null) {
            return;
        }
        this.f25957g.a();
    }

    @SuppressLint({"AddJavascriptInterface"})
    @TargetApi(19)
    public final void a(s sVar, fq fqVar, boolean z10, boolean z11) {
        int i10;
        if (Build.VERSION.SDK_INT >= 21 && this.f25947ab.equals("htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        this.E = fqVar;
        if (this.f25950ae == null) {
            o();
        } else {
            try {
                o();
                for (du duVar : this.f25950ae) {
                    if (duVar.f25178a == 2) {
                        if (duVar.f25179b.containsKey("type")) {
                            this.A = (byte) ((Integer) duVar.f25179b.get("type")).intValue();
                        } else {
                            p();
                        }
                        if (duVar.f25179b.containsKey("time")) {
                            this.ap = ((Integer) duVar.f25179b.get("time")).intValue();
                        } else {
                            r();
                        }
                        if (duVar.f25179b.containsKey("view")) {
                            this.aq = ((Integer) duVar.f25179b.get("view")).intValue();
                        } else {
                            q();
                        }
                        if (getImpressionType() == 2) {
                            if (duVar.f25179b.containsKey("pixel")) {
                                this.ao = ((Integer) duVar.f25179b.get("pixel")).intValue();
                            } else {
                                p();
                            }
                            if (duVar.f25179b.containsKey("frame")) {
                                JSONArray jSONArray = (JSONArray) duVar.f25179b.get("frame");
                                this.am = new int[jSONArray.length()];
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    this.am[i11] = ((Integer) jSONArray.get(i11)).intValue();
                                }
                            } else {
                                p();
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
                o();
            } catch (Exception unused2) {
                o();
            }
        }
        this.at = new m(getContext(), new hn(this.f25953c, this.ax, this.E.cctEnabled), this.ay, this.az);
        if ((getImpressionType() == 1 || getImpressionType() == 2) && !DownloadResource.TYPE_VIDEO.equals(this.f25974x)) {
            this.f25948ac = new eb(aB, this.E.viewability, getImpressionType());
            this.f25949ad = new ec(this.E.viewability, this.f25948ac, this.aA);
        }
        this.D = sVar;
        this.ag = z10;
        this.C = new WeakReference<>((ViewGroup) getParent());
        this.ai = z11;
        if (getRenderingConfig() != null) {
            setBackgroundColor(getRenderingConfig().a());
        }
        if (getMraidConfig() != null) {
            final da daVar = new da(getMraidConfig().url, getMraidConfig().maxRetries, getMraidConfig().retryInterval, getMraidConfig().expiry);
            if (daVar.f25065a != null) {
                gx gxVar = new gx("GET", daVar.f25065a);
                daVar.f25066b = gxVar;
                gxVar.f25620o = false;
                gxVar.f25625t = false;
                HashMap hashMap = new HashMap();
                hashMap.put("Accept-Encoding", "gzip");
                daVar.f25066b.a(hashMap);
                new Thread(new Runnable() { // from class: com.inmobi.media.da.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (da.a(daVar)) {
                            int i12 = 0;
                            while (i12 <= daVar.f25067d) {
                                String unused3 = da.f25064c;
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                gy a10 = new ha(daVar.f25066b).a();
                                try {
                                    iv.a().a(daVar.f25066b.g());
                                    iv.a().b(a10.d());
                                    iv.a().c(SystemClock.elapsedRealtime() - elapsedRealtime);
                                } catch (Exception unused4) {
                                    String unused5 = da.f25064c;
                                }
                                Context c10 = ho.c();
                                if (a10.a()) {
                                    String unused6 = da.f25064c;
                                    i12++;
                                    if (i12 > daVar.f25067d) {
                                        return;
                                    }
                                    try {
                                        Thread.sleep(daVar.f25068e * 1000);
                                    } catch (InterruptedException unused7) {
                                        String unused8 = da.f25064c;
                                    }
                                } else if (c10 != null) {
                                    hx hxVar = new hx(c10, "mraid_js_store");
                                    List<String> list = a10.f25629c.get("Content-Encoding");
                                    if (list != null && list.get(0).equals("gzip")) {
                                        String unused9 = da.f25064c;
                                        byte[] a11 = hv.a(a10.c());
                                        if (a11 != null) {
                                            try {
                                                hxVar.b("mraid_js_string", new String(a11, "UTF-8"));
                                                String unused10 = da.f25064c;
                                                return;
                                            } catch (UnsupportedEncodingException unused11) {
                                                String unused12 = da.f25064c;
                                                String unused13 = da.f25064c;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    hxVar.b("mraid_js_string", a10.b());
                                    String unused14 = da.f25064c;
                                    return;
                                }
                            }
                        }
                    }
                }).start();
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 16) {
            setImportantForAccessibility(2);
        }
        setScrollable(false);
        if (i12 >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        getSettings().setJavaScriptEnabled(true);
        getSettings().setGeolocationEnabled(true);
        r rVar = this.av;
        if (this.f25955e == 0) {
            i10 = this.E.rendering.bannerNetworkLoadsLimit;
        } else {
            i10 = this.E.rendering.otherNetworkLoadsLimit;
        }
        rVar.f26002a = (short) i10;
        setWebViewClient(rVar);
        setWebChromeClient(this.aD);
        addJavascriptInterface(new cq(this, this.f25955e), "sdkController");
        this.f25956f = new cz(this, this.f25947ab);
        this.f25957g = new dc(this);
        this.f25958h = new db(this);
        this.G = new cx();
        this.H = new de(de.DEFAULT_POSITION, Boolean.TRUE);
    }

    @Override // com.inmobi.media.j
    public final void a(byte b10, Map<String, String> map) {
        if (b10 != 2) {
            return;
        }
        d("inmobi.recordEvent(120,null);");
    }

    public final void a(String str) {
        this.f25968r = false;
        if (this.f25967q.get()) {
            return;
        }
        loadDataWithBaseURL("", str, "text/html", "UTF-8", null);
    }

    public final void a(boolean z10) {
        d("window.imraidview.broadcastEvent('adLoadSuccess'," + z10 + ");");
    }

    public final void a(String str, String str2) {
        if (str == null) {
            return;
        }
        d(str + "." + str2);
    }

    private void a(String str, Map<String, Object> map) {
        getListener().a(str, map);
    }

    @Override // com.inmobi.media.j
    public final void a() {
        this.N = false;
        try {
            q.class.getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this, 1, null);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    @Override // com.inmobi.media.l
    public final void a(String str, String str2, String str3) {
        a(str, str2 + "(" + str3 + ");");
    }

    static /* synthetic */ boolean a(q qVar, JsResult jsResult) {
        fq.i renderingConfig = qVar.getRenderingConfig();
        if (renderingConfig == null || !renderingConfig.shouldRenderPopup) {
            jsResult.cancel();
            qVar.d("window.mraidview.popupBlocked('popupBlocked')");
            return false;
        }
        return true;
    }
}
