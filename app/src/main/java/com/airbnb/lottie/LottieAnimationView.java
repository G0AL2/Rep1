package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class LottieAnimationView extends androidx.appcompat.widget.r {

    /* renamed from: r */
    private static final String f5693r = LottieAnimationView.class.getSimpleName();

    /* renamed from: s */
    private static final f0<Throwable> f5694s = new f0() { // from class: com.airbnb.lottie.e
        @Override // com.airbnb.lottie.f0
        public final void a(Object obj) {
            LottieAnimationView.c((Throwable) obj);
        }
    };

    /* renamed from: d */
    private final f0<h> f5695d;

    /* renamed from: e */
    private final f0<Throwable> f5696e;

    /* renamed from: f */
    private f0<Throwable> f5697f;

    /* renamed from: g */
    private int f5698g;

    /* renamed from: h */
    private final d0 f5699h;

    /* renamed from: i */
    private String f5700i;

    /* renamed from: j */
    private int f5701j;

    /* renamed from: k */
    private boolean f5702k;

    /* renamed from: l */
    private boolean f5703l;

    /* renamed from: m */
    private boolean f5704m;

    /* renamed from: n */
    private final Set<b> f5705n;

    /* renamed from: o */
    private final Set<h0> f5706o;

    /* renamed from: p */
    private l0<h> f5707p;

    /* renamed from: q */
    private h f5708q;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a */
        String f5709a;

        /* renamed from: b */
        int f5710b;

        /* renamed from: c */
        float f5711c;

        /* renamed from: d */
        boolean f5712d;

        /* renamed from: e */
        String f5713e;

        /* renamed from: f */
        int f5714f;

        /* renamed from: g */
        int f5715g;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f5709a);
            parcel.writeFloat(this.f5711c);
            parcel.writeInt(this.f5712d ? 1 : 0);
            parcel.writeString(this.f5713e);
            parcel.writeInt(this.f5714f);
            parcel.writeInt(this.f5715g);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f5709a = parcel.readString();
            this.f5711c = parcel.readFloat();
            this.f5712d = parcel.readInt() == 1;
            this.f5713e = parcel.readString();
            this.f5714f = parcel.readInt();
            this.f5715g = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public class a implements f0<Throwable> {
        a() {
            LottieAnimationView.this = r1;
        }

        @Override // com.airbnb.lottie.f0
        /* renamed from: b */
        public void a(Throwable th) {
            if (LottieAnimationView.this.f5698g != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f5698g);
            }
            (LottieAnimationView.this.f5697f == null ? LottieAnimationView.f5694s : LottieAnimationView.this.f5697f).a(th);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f5695d = new f0() { // from class: com.airbnb.lottie.d
            @Override // com.airbnb.lottie.f0
            public final void a(Object obj) {
                LottieAnimationView.this.setComposition((h) obj);
            }
        };
        this.f5696e = new a();
        this.f5698g = 0;
        this.f5699h = new d0();
        this.f5702k = false;
        this.f5703l = false;
        this.f5704m = true;
        this.f5705n = new HashSet();
        this.f5706o = new HashSet();
        q(null, n0.lottieAnimationViewStyle);
    }

    private void B() {
        boolean r10 = r();
        setImageDrawable(null);
        setImageDrawable(this.f5699h);
        if (r10) {
            this.f5699h.t0();
        }
    }

    public static /* synthetic */ void c(Throwable th) {
        u(th);
    }

    public static /* synthetic */ j0 d(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.s(str);
    }

    public static /* synthetic */ j0 e(LottieAnimationView lottieAnimationView, int i10) {
        return lottieAnimationView.t(i10);
    }

    private void l() {
        l0<h> l0Var = this.f5707p;
        if (l0Var != null) {
            l0Var.j(this.f5695d);
            this.f5707p.i(this.f5696e);
        }
    }

    private void m() {
        this.f5708q = null;
        this.f5699h.u();
    }

    private l0<h> o(final String str) {
        if (isInEditMode()) {
            return new l0<>(new Callable() { // from class: com.airbnb.lottie.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.d(LottieAnimationView.this, str);
                }
            }, true);
        }
        return this.f5704m ? p.j(getContext(), str) : p.k(getContext(), str, null);
    }

    private l0<h> p(final int i10) {
        if (isInEditMode()) {
            return new l0<>(new Callable() { // from class: com.airbnb.lottie.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.e(LottieAnimationView.this, i10);
                }
            }, true);
        }
        return this.f5704m ? p.s(getContext(), i10) : p.t(getContext(), i10, null);
    }

    private void q(AttributeSet attributeSet, int i10) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o0.f5856a, i10, 0);
        this.f5704m = obtainStyledAttributes.getBoolean(o0.f5858c, true);
        int i11 = o0.f5868m;
        boolean hasValue = obtainStyledAttributes.hasValue(i11);
        int i12 = o0.f5863h;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i12);
        int i13 = o0.f5873r;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i13);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i11, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i12);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i13)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(o0.f5862g, 0));
        if (obtainStyledAttributes.getBoolean(o0.f5857b, false)) {
            this.f5703l = true;
        }
        if (obtainStyledAttributes.getBoolean(o0.f5866k, false)) {
            this.f5699h.R0(-1);
        }
        int i14 = o0.f5871p;
        if (obtainStyledAttributes.hasValue(i14)) {
            setRepeatMode(obtainStyledAttributes.getInt(i14, 1));
        }
        int i15 = o0.f5870o;
        if (obtainStyledAttributes.hasValue(i15)) {
            setRepeatCount(obtainStyledAttributes.getInt(i15, -1));
        }
        int i16 = o0.f5872q;
        if (obtainStyledAttributes.hasValue(i16)) {
            setSpeed(obtainStyledAttributes.getFloat(i16, 1.0f));
        }
        int i17 = o0.f5859d;
        if (obtainStyledAttributes.hasValue(i17)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i17, true));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(o0.f5865j));
        setProgress(obtainStyledAttributes.getFloat(o0.f5867l, 0.0f));
        n(obtainStyledAttributes.getBoolean(o0.f5861f, false));
        int i18 = o0.f5860e;
        if (obtainStyledAttributes.hasValue(i18)) {
            j(new b2.e("**"), i0.K, new j2.c(new q0(e.a.a(getContext(), obtainStyledAttributes.getResourceId(i18, -1)).getDefaultColor())));
        }
        int i19 = o0.f5869n;
        if (obtainStyledAttributes.hasValue(i19)) {
            p0 p0Var = p0.AUTOMATIC;
            int i20 = obtainStyledAttributes.getInt(i19, p0Var.ordinal());
            if (i20 >= p0.values().length) {
                i20 = p0Var.ordinal();
            }
            setRenderMode(p0.values()[i20]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(o0.f5864i, false));
        obtainStyledAttributes.recycle();
        this.f5699h.V0(Boolean.valueOf(i2.h.f(getContext()) != 0.0f));
    }

    public /* synthetic */ j0 s(String str) throws Exception {
        return this.f5704m ? p.l(getContext(), str) : p.m(getContext(), str, null);
    }

    private void setCompositionTask(l0<h> l0Var) {
        this.f5705n.add(b.SET_ANIMATION);
        m();
        l();
        this.f5707p = l0Var.d(this.f5695d).c(this.f5696e);
    }

    public /* synthetic */ j0 t(int i10) throws Exception {
        return this.f5704m ? p.u(getContext(), i10) : p.v(getContext(), i10, null);
    }

    public static /* synthetic */ void u(Throwable th) {
        if (i2.h.k(th)) {
            i2.d.d("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    public void A(String str, String str2) {
        z(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void C(int i10, int i11) {
        this.f5699h.I0(i10, i11);
    }

    public boolean getClipToCompositionBounds() {
        return this.f5699h.F();
    }

    public h getComposition() {
        return this.f5708q;
    }

    public long getDuration() {
        h hVar = this.f5708q;
        if (hVar != null) {
            return hVar.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f5699h.J();
    }

    public String getImageAssetsFolder() {
        return this.f5699h.L();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f5699h.N();
    }

    public float getMaxFrame() {
        return this.f5699h.O();
    }

    public float getMinFrame() {
        return this.f5699h.P();
    }

    public m0 getPerformanceTracker() {
        return this.f5699h.Q();
    }

    public float getProgress() {
        return this.f5699h.R();
    }

    public p0 getRenderMode() {
        return this.f5699h.S();
    }

    public int getRepeatCount() {
        return this.f5699h.T();
    }

    public int getRepeatMode() {
        return this.f5699h.U();
    }

    public float getSpeed() {
        return this.f5699h.V();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.f5699h.p(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof d0) && ((d0) drawable).S() == p0.SOFTWARE) {
            this.f5699h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        d0 d0Var = this.f5699h;
        if (drawable2 == d0Var) {
            super.invalidateDrawable(d0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public <T> void j(b2.e eVar, T t10, j2.c<T> cVar) {
        this.f5699h.q(eVar, t10, cVar);
    }

    public void k() {
        this.f5705n.add(b.PLAY_OPTION);
        this.f5699h.t();
    }

    public void n(boolean z10) {
        this.f5699h.z(z10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f5703l) {
            return;
        }
        this.f5699h.q0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f5700i = savedState.f5709a;
        Set<b> set = this.f5705n;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f5700i)) {
            setAnimation(this.f5700i);
        }
        this.f5701j = savedState.f5710b;
        if (!this.f5705n.contains(bVar) && (i10 = this.f5701j) != 0) {
            setAnimation(i10);
        }
        if (!this.f5705n.contains(b.SET_PROGRESS)) {
            setProgress(savedState.f5711c);
        }
        if (!this.f5705n.contains(b.PLAY_OPTION) && savedState.f5712d) {
            w();
        }
        if (!this.f5705n.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f5713e);
        }
        if (!this.f5705n.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f5714f);
        }
        if (this.f5705n.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f5715g);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5709a = this.f5700i;
        savedState.f5710b = this.f5701j;
        savedState.f5711c = this.f5699h.R();
        savedState.f5712d = this.f5699h.a0();
        savedState.f5713e = this.f5699h.L();
        savedState.f5714f = this.f5699h.U();
        savedState.f5715g = this.f5699h.T();
        return savedState;
    }

    public boolean r() {
        return this.f5699h.Z();
    }

    public void setAnimation(int i10) {
        this.f5701j = i10;
        this.f5700i = null;
        setCompositionTask(p(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        A(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f5704m ? p.w(getContext(), str) : p.x(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f5699h.w0(z10);
    }

    public void setCacheComposition(boolean z10) {
        this.f5704m = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f5699h.x0(z10);
    }

    public void setComposition(h hVar) {
        if (c.f5729a) {
            String str = f5693r;
            Log.v(str, "Set Composition \n" + hVar);
        }
        this.f5699h.setCallback(this);
        this.f5708q = hVar;
        this.f5702k = true;
        boolean y02 = this.f5699h.y0(hVar);
        this.f5702k = false;
        if (getDrawable() != this.f5699h || y02) {
            if (!y02) {
                B();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (h0 h0Var : this.f5706o) {
                h0Var.a(hVar);
            }
        }
    }

    public void setFailureListener(f0<Throwable> f0Var) {
        this.f5697f = f0Var;
    }

    public void setFallbackResource(int i10) {
        this.f5698g = i10;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.a aVar) {
        this.f5699h.z0(aVar);
    }

    public void setFrame(int i10) {
        this.f5699h.A0(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f5699h.B0(z10);
    }

    public void setImageAssetDelegate(com.airbnb.lottie.b bVar) {
        this.f5699h.C0(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f5699h.D0(str);
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        l();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        l();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.r, android.widget.ImageView
    public void setImageResource(int i10) {
        l();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f5699h.E0(z10);
    }

    public void setMaxFrame(int i10) {
        this.f5699h.F0(i10);
    }

    public void setMaxProgress(float f10) {
        this.f5699h.H0(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.f5699h.J0(str);
    }

    public void setMinFrame(int i10) {
        this.f5699h.K0(i10);
    }

    public void setMinProgress(float f10) {
        this.f5699h.M0(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f5699h.N0(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f5699h.O0(z10);
    }

    public void setProgress(float f10) {
        this.f5705n.add(b.SET_PROGRESS);
        this.f5699h.P0(f10);
    }

    public void setRenderMode(p0 p0Var) {
        this.f5699h.Q0(p0Var);
    }

    public void setRepeatCount(int i10) {
        this.f5705n.add(b.SET_REPEAT_COUNT);
        this.f5699h.R0(i10);
    }

    public void setRepeatMode(int i10) {
        this.f5705n.add(b.SET_REPEAT_MODE);
        this.f5699h.S0(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f5699h.T0(z10);
    }

    public void setSpeed(float f10) {
        this.f5699h.U0(f10);
    }

    public void setTextDelegate(r0 r0Var) {
        this.f5699h.W0(r0Var);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        d0 d0Var;
        if (!this.f5702k && drawable == (d0Var = this.f5699h) && d0Var.Z()) {
            v();
        } else if (!this.f5702k && (drawable instanceof d0)) {
            d0 d0Var2 = (d0) drawable;
            if (d0Var2.Z()) {
                d0Var2.p0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void v() {
        this.f5703l = false;
        this.f5699h.p0();
    }

    public void w() {
        this.f5705n.add(b.PLAY_OPTION);
        this.f5699h.q0();
    }

    public void x() {
        this.f5705n.add(b.PLAY_OPTION);
        this.f5699h.t0();
    }

    public void y() {
        this.f5699h.u0();
    }

    public void z(InputStream inputStream, String str) {
        setCompositionTask(p.n(inputStream, str));
    }

    public void setMaxFrame(String str) {
        this.f5699h.G0(str);
    }

    public void setMinFrame(String str) {
        this.f5699h.L0(str);
    }

    public void setAnimation(String str) {
        this.f5700i = str;
        this.f5701j = 0;
        setCompositionTask(o(str));
    }
}
