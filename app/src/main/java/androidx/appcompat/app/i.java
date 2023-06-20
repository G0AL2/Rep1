package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.appcompat.widget.w;
import androidx.appcompat.widget.w0;
import androidx.appcompat.widget.y;
import androidx.core.view.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class i {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final int[] sAccessibilityHeading = {16844160};
    private static final int[] sAccessibilityPaneTitle = {16844156};
    private static final int[] sScreenReaderFocusable = {16844148};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final androidx.collection.g<String, Constructor<? extends View>> sConstructorMap = new androidx.collection.g<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatViewInflater.java */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f904a;

        /* renamed from: b  reason: collision with root package name */
        private final String f905b;

        /* renamed from: c  reason: collision with root package name */
        private Method f906c;

        /* renamed from: d  reason: collision with root package name */
        private Context f907d;

        public a(View view, String str) {
            this.f904a = view;
            this.f905b = str;
        }

        private void a(Context context) {
            int id2;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f905b, View.class)) != null) {
                        this.f906c = method;
                        this.f907d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            if (this.f904a.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.f904a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f905b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f904a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f906c == null) {
                a(this.f904a.getContext());
            }
            try {
                this.f906c.invoke(this.f907d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void backportAccessibilityAttributes(Context context, View view, AttributeSet attributeSet) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19 || i10 > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (obtainStyledAttributes.hasValue(0)) {
            z.r0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (obtainStyledAttributes2.hasValue(0)) {
            z.t0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (obtainStyledAttributes3.hasValue(0)) {
            z.G0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || z.P(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        androidx.collection.g<String, Constructor<? extends View>> gVar = sConstructorMap;
        Constructor<? extends View> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i10 >= strArr.length) {
                    return null;
                }
                View createViewByPrefix = createViewByPrefix(context, str, strArr[i10]);
                if (createViewByPrefix != null) {
                    return createViewByPrefix;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.D3, 0, 0);
        int resourceId = z10 ? obtainStyledAttributes.getResourceId(d.j.E3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(d.j.F3, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof i.d) && ((i.d) context).c() == resourceId) ? context : new i.d(context, resourceId) : context;
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected androidx.appcompat.widget.d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    protected androidx.appcompat.widget.f createButton(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    protected androidx.appcompat.widget.g createCheckBox(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    protected androidx.appcompat.widget.h createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    protected androidx.appcompat.widget.l createEditText(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.l(context, attributeSet);
    }

    protected p createImageButton(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected r createImageView(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    protected s createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    protected v createRadioButton(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    protected w createRatingBar(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    protected y createSeekBar(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    protected AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    protected d0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new d0(context, attributeSet);
    }

    protected View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View createRatingBar;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = themifyContext(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = w0.b(context2);
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c10 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c10 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c10 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c10 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c10 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c10 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c10 = '\r';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                createRatingBar = createRatingBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 1:
                createRatingBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 2:
                createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 3:
                createRatingBar = createTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 4:
                createRatingBar = createImageButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 5:
                createRatingBar = createSeekBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 6:
                createRatingBar = createSpinner(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 7:
                createRatingBar = createRadioButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\b':
                createRatingBar = createToggleButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\t':
                createRatingBar = createImageView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\n':
                createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 11:
                createRatingBar = createCheckBox(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\f':
                createRatingBar = createEditText(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\r':
                createRatingBar = createButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (createRatingBar == null && context != context2) {
            createRatingBar = createViewFromTag(context2, str, attributeSet);
        }
        if (createRatingBar != null) {
            checkOnClickListener(createRatingBar, attributeSet);
            backportAccessibilityAttributes(context2, createRatingBar, attributeSet);
        }
        return createRatingBar;
    }
}
