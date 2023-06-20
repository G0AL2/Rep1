package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y.i;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public class b extends g implements Animatable {

    /* renamed from: b  reason: collision with root package name */
    private C0078b f4171b;

    /* renamed from: c  reason: collision with root package name */
    private Context f4172c;

    /* renamed from: d  reason: collision with root package name */
    private ArgbEvaluator f4173d;

    /* renamed from: e  reason: collision with root package name */
    final Drawable.Callback f4174e;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            b.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0078b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f4176a;

        /* renamed from: b  reason: collision with root package name */
        h f4177b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f4178c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f4179d;

        /* renamed from: e  reason: collision with root package name */
        androidx.collection.a<Animator, String> f4180e;

        public C0078b(Context context, C0078b c0078b, Drawable.Callback callback, Resources resources) {
            if (c0078b != null) {
                this.f4176a = c0078b.f4176a;
                h hVar = c0078b.f4177b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f4177b = (h) constantState.newDrawable(resources);
                    } else {
                        this.f4177b = (h) constantState.newDrawable();
                    }
                    h hVar2 = (h) this.f4177b.mutate();
                    this.f4177b = hVar2;
                    hVar2.setCallback(callback);
                    this.f4177b.setBounds(c0078b.f4177b.getBounds());
                    this.f4177b.h(false);
                }
                ArrayList<Animator> arrayList = c0078b.f4179d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4179d = new ArrayList<>(size);
                    this.f4180e = new androidx.collection.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = c0078b.f4179d.get(i10);
                        Animator clone = animator.clone();
                        String str = c0078b.f4180e.get(animator);
                        clone.setTarget(this.f4177b.d(str));
                        this.f4179d.add(clone);
                        this.f4180e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f4178c == null) {
                this.f4178c = new AnimatorSet();
            }
            this.f4178c.playTogether(this.f4179d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4176a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    b() {
        this(null, null, null);
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f4171b.f4177b.d(str));
        if (Build.VERSION.SDK_INT < 21) {
            c(animator);
        }
        C0078b c0078b = this.f4171b;
        if (c0078b.f4179d == null) {
            c0078b.f4179d = new ArrayList<>();
            this.f4171b.f4180e = new androidx.collection.a<>();
        }
        this.f4171b.f4179d.add(animator);
        this.f4171b.f4180e.put(animator, str);
    }

    private void c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i10 = 0; i10 < childAnimations.size(); i10++) {
                c(childAnimations.get(i10));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4173d == null) {
                    this.f4173d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4173d);
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4171b.f4177b.draw(canvas);
        if (this.f4171b.f4178c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f4171b.f4177b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4171b.f4176a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f4171b.f4177b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4186a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f4186a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f4171b.f4177b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f4171b.f4177b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f4171b.f4177b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k10 = i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4163e);
                    int resourceId = k10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h b10 = h.b(resources, resourceId, theme);
                        b10.h(false);
                        b10.setCallback(this.f4174e);
                        h hVar = this.f4171b.f4177b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f4171b.f4177b = b10;
                    }
                    k10.recycle();
                } else if (Analytics.Param.TARGET.equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f4164f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4172c;
                        if (context != null) {
                            b(string, d.i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4171b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f4171b.f4177b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f4171b.f4178c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f4171b.f4177b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4171b.f4177b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f4171b.f4177b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f4171b.f4177b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f4171b.f4177b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f4171b.f4177b.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4171b.f4177b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTint(int i10) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            this.f4171b.f4177b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f4171b.f4177b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f4171b.f4177b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f4171b.f4177b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f4171b.f4178c.isStarted()) {
        } else {
            this.f4171b.f4178c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4171b.f4178c.end();
        }
    }

    private b(Context context) {
        this(context, null, null);
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f4181a;

        public c(Drawable.ConstantState constantState) {
            this.f4181a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f4181a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4181a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f4181a.newDrawable();
            bVar.f4186a = newDrawable;
            newDrawable.setCallback(bVar.f4174e);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f4181a.newDrawable(resources);
            bVar.f4186a = newDrawable;
            newDrawable.setCallback(bVar.f4174e);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f4181a.newDrawable(resources, theme);
            bVar.f4186a = newDrawable;
            newDrawable.setCallback(bVar.f4174e);
            return bVar;
        }
    }

    private b(Context context, C0078b c0078b, Resources resources) {
        this.f4173d = null;
        a aVar = new a();
        this.f4174e = aVar;
        this.f4172c = context;
        if (c0078b != null) {
            this.f4171b = c0078b;
        } else {
            this.f4171b = new C0078b(context, c0078b, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
