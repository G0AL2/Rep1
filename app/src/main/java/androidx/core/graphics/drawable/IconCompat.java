package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.applovin.sdk.AppLovinEventTypes;
import fm.castbox.mediation.model.NetworkName;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f2610k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f2611a;

    /* renamed from: b  reason: collision with root package name */
    Object f2612b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f2613c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f2614d;

    /* renamed from: e  reason: collision with root package name */
    public int f2615e;

    /* renamed from: f  reason: collision with root package name */
    public int f2616f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2617g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f2618h;

    /* renamed from: i  reason: collision with root package name */
    public String f2619i;

    /* renamed from: j  reason: collision with root package name */
    public String f2620j;

    public IconCompat() {
        this.f2611a = -1;
        this.f2613c = null;
        this.f2614d = null;
        this.f2615e = 0;
        this.f2616f = 0;
        this.f2617g = null;
        this.f2618h = f2610k;
        this.f2619i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f2612b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat c(Resources resources, String str, int i10) {
        if (str != null) {
            if (i10 != 0) {
                IconCompat iconCompat = new IconCompat(2);
                iconCompat.f2615e = i10;
                if (resources != null) {
                    try {
                        iconCompat.f2612b = resources.getResourceName(i10);
                    } catch (Resources.NotFoundException unused) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                } else {
                    iconCompat.f2612b = str;
                }
                iconCompat.f2620j = str;
                return iconCompat;
            }
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    private static int f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    private static String h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon package", e12);
            return null;
        }
    }

    private static int j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e12);
            return -1;
        }
    }

    private static Uri l(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    private static String r(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return NetworkName.UNKNOWN;
        }
    }

    public Bitmap d() {
        int i10 = this.f2611a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f2612b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f2612b;
        } else {
            if (i10 == 5) {
                return a((Bitmap) this.f2612b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int e() {
        int i10 = this.f2611a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 == 2) {
                return this.f2615e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return f((Icon) this.f2612b);
    }

    public String g() {
        int i10 = this.f2611a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 == 2) {
                if (TextUtils.isEmpty(this.f2620j)) {
                    return ((String) this.f2612b).split(":", -1)[0];
                }
                return this.f2620j;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return h((Icon) this.f2612b);
    }

    public int i() {
        int i10 = this.f2611a;
        return (i10 != -1 || Build.VERSION.SDK_INT < 23) ? i10 : j((Icon) this.f2612b);
    }

    public Uri k() {
        int i10 = this.f2611a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 != 4 && i10 != 6) {
                throw new IllegalStateException("called getUri() on " + this);
            }
            return Uri.parse((String) this.f2612b);
        }
        return l((Icon) this.f2612b);
    }

    public InputStream m(Context context) {
        Uri k10 = k();
        String scheme = k10.getScheme();
        if (!AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f2612b));
            } catch (FileNotFoundException e10) {
                Log.w("IconCompat", "Unable to load image from path: " + k10, e10);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(k10);
        } catch (Exception e11) {
            Log.w("IconCompat", "Unable to load image from URI: " + k10, e11);
            return null;
        }
    }

    public void n() {
        this.f2618h = PorterDuff.Mode.valueOf(this.f2619i);
        switch (this.f2611a) {
            case -1:
                Parcelable parcelable = this.f2614d;
                if (parcelable != null) {
                    this.f2612b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2614d;
                if (parcelable2 != null) {
                    this.f2612b = parcelable2;
                    return;
                }
                byte[] bArr = this.f2613c;
                this.f2612b = bArr;
                this.f2611a = 3;
                this.f2615e = 0;
                this.f2616f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2613c, Charset.forName("UTF-16"));
                this.f2612b = str;
                if (this.f2611a == 2 && this.f2620j == null) {
                    this.f2620j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2612b = this.f2613c;
                return;
        }
    }

    public void o(boolean z10) {
        this.f2619i = this.f2618h.name();
        switch (this.f2611a) {
            case -1:
                if (!z10) {
                    this.f2614d = (Parcelable) this.f2612b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f2612b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2613c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f2614d = (Parcelable) this.f2612b;
                return;
            case 2:
                this.f2613c = ((String) this.f2612b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2613c = (byte[]) this.f2612b;
                return;
            case 4:
            case 6:
                this.f2613c = this.f2612b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @Deprecated
    public Icon p() {
        return q(null);
    }

    public Icon q(Context context) {
        Icon createWithBitmap;
        switch (this.f2611a) {
            case -1:
                return (Icon) this.f2612b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f2612b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(g(), this.f2615e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f2612b, this.f2615e, this.f2616f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f2612b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f2612b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f2612b, false));
                    break;
                }
            case 6:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(k());
                    break;
                } else if (context != null) {
                    InputStream m10 = m(context);
                    if (m10 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + k());
                    } else if (i10 >= 26) {
                        createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(m10));
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(m10), false));
                        break;
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + k());
                }
        }
        ColorStateList colorStateList = this.f2617g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f2618h;
        if (mode != f2610k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public String toString() {
        if (this.f2611a == -1) {
            return String.valueOf(this.f2612b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(r(this.f2611a));
        switch (this.f2611a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f2612b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f2612b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f2620j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f2615e);
                if (this.f2616f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f2616f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f2612b);
                break;
        }
        if (this.f2617g != null) {
            sb2.append(" tint=");
            sb2.append(this.f2617g);
        }
        if (this.f2618h != f2610k) {
            sb2.append(" mode=");
            sb2.append(this.f2618h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    private IconCompat(int i10) {
        this.f2611a = -1;
        this.f2613c = null;
        this.f2614d = null;
        this.f2615e = 0;
        this.f2616f = 0;
        this.f2617g = null;
        this.f2618h = f2610k;
        this.f2619i = null;
        this.f2611a = i10;
    }
}
