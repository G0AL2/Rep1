package y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ComplexColorCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Shader f38916a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f38917b;

    /* renamed from: c  reason: collision with root package name */
    private int f38918c;

    private d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f38916a = shader;
        this.f38917b = colorStateList;
        this.f38918c = i10;
    }

    private static d a(Resources resources, int i10, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return d(f.b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return c(c.b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(int i10) {
        return new d(null, null, i10);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    public int e() {
        return this.f38918c;
    }

    public Shader f() {
        return this.f38916a;
    }

    public boolean h() {
        return this.f38916a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f38916a == null && (colorStateList = this.f38917b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f38917b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f38918c) {
                this.f38918c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i10) {
        this.f38918c = i10;
    }

    public boolean l() {
        return h() || this.f38918c != 0;
    }
}
