package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ConstraintAttribute.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2065a;

    /* renamed from: b  reason: collision with root package name */
    String f2066b;

    /* renamed from: c  reason: collision with root package name */
    private EnumC0043b f2067c;

    /* renamed from: d  reason: collision with root package name */
    private int f2068d;

    /* renamed from: e  reason: collision with root package name */
    private float f2069e;

    /* renamed from: f  reason: collision with root package name */
    private String f2070f;

    /* renamed from: g  reason: collision with root package name */
    boolean f2071g;

    /* renamed from: h  reason: collision with root package name */
    private int f2072h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintAttribute.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2073a;

        static {
            int[] iArr = new int[EnumC0043b.values().length];
            f2073a = iArr;
            try {
                iArr[EnumC0043b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2073a[EnumC0043b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2073a[EnumC0043b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2073a[EnumC0043b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2073a[EnumC0043b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2073a[EnumC0043b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2073a[EnumC0043b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2073a[EnumC0043b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: ConstraintAttribute.java */
    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0043b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(String str, EnumC0043b enumC0043b, Object obj, boolean z10) {
        this.f2065a = false;
        this.f2066b = str;
        this.f2067c = enumC0043b;
        this.f2065a = z10;
        f(obj);
    }

    public static HashMap<String, b> a(HashMap<String, b> hashMap, View view) {
        HashMap<String, b> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void d(Context context, XmlPullParser xmlPullParser, HashMap<String, b> hashMap) {
        EnumC0043b enumC0043b;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.f2253d4);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0043b enumC0043b2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == k.f2261e4) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == k.f2341o4) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == k.f2269f4) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0043b2 = EnumC0043b.BOOLEAN_TYPE;
            } else {
                if (index == k.f2285h4) {
                    enumC0043b = EnumC0043b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == k.f2277g4) {
                    enumC0043b = EnumC0043b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == k.f2317l4) {
                    enumC0043b = EnumC0043b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == k.f2293i4) {
                    enumC0043b = EnumC0043b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == k.f2301j4) {
                    enumC0043b = EnumC0043b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == k.f2309k4) {
                    enumC0043b = EnumC0043b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == k.f2333n4) {
                    enumC0043b = EnumC0043b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == k.f2325m4) {
                    enumC0043b = EnumC0043b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                enumC0043b2 = enumC0043b;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new b(str, enumC0043b2, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, b> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            b bVar = hashMap.get(str);
            String str2 = bVar.f2065a ? str : "set" + str;
            try {
                switch (a.f2073a[bVar.f2067c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f2068d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f2071g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f2070f);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f2072h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f2072h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f2068d));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f2069e));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f2069e));
                        break;
                }
            } catch (IllegalAccessException e10) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                Log.e("TransitionLayout", e11.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e12.printStackTrace();
            }
        }
    }

    public String b() {
        return this.f2066b;
    }

    public EnumC0043b c() {
        return this.f2067c;
    }

    public void f(Object obj) {
        switch (a.f2073a[this.f2067c.ordinal()]) {
            case 1:
            case 6:
                this.f2068d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f2071g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f2070f = (String) obj;
                return;
            case 4:
            case 5:
                this.f2072h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f2069e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f2069e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public b(b bVar, Object obj) {
        this.f2065a = false;
        this.f2066b = bVar.f2066b;
        this.f2067c = bVar.f2067c;
        f(obj);
    }
}
