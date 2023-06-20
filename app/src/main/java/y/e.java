package y;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat.java */
/* loaded from: classes.dex */
public class e {

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final c[] f38919a;

        public b(c[] cVarArr) {
            this.f38919a = cVarArr;
        }

        public c[] a() {
            return this.f38919a;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f38920a;

        /* renamed from: b  reason: collision with root package name */
        private int f38921b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f38922c;

        /* renamed from: d  reason: collision with root package name */
        private String f38923d;

        /* renamed from: e  reason: collision with root package name */
        private int f38924e;

        /* renamed from: f  reason: collision with root package name */
        private int f38925f;

        public c(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f38920a = str;
            this.f38921b = i10;
            this.f38922c = z10;
            this.f38923d = str2;
            this.f38924e = i11;
            this.f38925f = i12;
        }

        public String a() {
            return this.f38920a;
        }

        public int b() {
            return this.f38925f;
        }

        public int c() {
            return this.f38924e;
        }

        public String d() {
            return this.f38923d;
        }

        public int e() {
            return this.f38921b;
        }

        public boolean f() {
            return this.f38922c;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    /* loaded from: classes.dex */
    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        private final f0.d f38926a;

        /* renamed from: b  reason: collision with root package name */
        private final int f38927b;

        /* renamed from: c  reason: collision with root package name */
        private final int f38928c;

        /* renamed from: d  reason: collision with root package name */
        private final String f38929d;

        public d(f0.d dVar, int i10, int i11, String str) {
            this.f38926a = dVar;
            this.f38928c = i10;
            this.f38927b = i11;
            this.f38929d = str;
        }

        public int a() {
            return this.f38928c;
        }

        public f0.d b() {
            return this.f38926a;
        }

        public String c() {
            return this.f38929d;
        }

        public int d() {
            return this.f38927b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i10);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), w.d.f38126g);
        String string = obtainAttributes.getString(w.d.f38127h);
        String string2 = obtainAttributes.getString(w.d.f38131l);
        String string3 = obtainAttributes.getString(w.d.f38132m);
        int resourceId = obtainAttributes.getResourceId(w.d.f38128i, 0);
        int integer = obtainAttributes.getInteger(w.d.f38129j, 1);
        int integer2 = obtainAttributes.getInteger(w.d.f38130k, 500);
        String string4 = obtainAttributes.getString(w.d.f38133n);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new f0.d(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
    }

    private static c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), w.d.f38134o);
        int i10 = w.d.f38143x;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = w.d.f38136q;
        }
        int i11 = obtainAttributes.getInt(i10, DownloadResource.STATUS_BAD_REQUEST);
        int i12 = w.d.f38141v;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = w.d.f38137r;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = w.d.f38144y;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = w.d.f38138s;
        }
        int i14 = w.d.f38142w;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = w.d.f38139t;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = w.d.f38140u;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = w.d.f38135p;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new c(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
