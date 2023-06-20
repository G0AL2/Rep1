package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f2092a;

    /* renamed from: b  reason: collision with root package name */
    e f2093b;

    /* renamed from: c  reason: collision with root package name */
    int f2094c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f2095d = -1;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<a> f2096e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private SparseArray<e> f2097f = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f2098a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<b> f2099b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        int f2100c;

        /* renamed from: d  reason: collision with root package name */
        e f2101d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f2100c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.S5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.T5) {
                    this.f2098a = obtainStyledAttributes.getResourceId(index, this.f2098a);
                } else if (index == k.U5) {
                    this.f2100c = obtainStyledAttributes.getResourceId(index, this.f2100c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2100c);
                    context.getResources().getResourceName(this.f2100c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f2101d = eVar;
                        eVar.e(context, this.f2100c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f2099b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f2099b.size(); i10++) {
                if (this.f2099b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintLayoutStates.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        float f2102a;

        /* renamed from: b  reason: collision with root package name */
        float f2103b;

        /* renamed from: c  reason: collision with root package name */
        float f2104c;

        /* renamed from: d  reason: collision with root package name */
        float f2105d;

        /* renamed from: e  reason: collision with root package name */
        int f2106e;

        /* renamed from: f  reason: collision with root package name */
        e f2107f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f2102a = Float.NaN;
            this.f2103b = Float.NaN;
            this.f2104c = Float.NaN;
            this.f2105d = Float.NaN;
            this.f2106e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.f2295i6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f2303j6) {
                    this.f2106e = obtainStyledAttributes.getResourceId(index, this.f2106e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2106e);
                    context.getResources().getResourceName(this.f2106e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f2107f = eVar;
                        eVar.e(context, this.f2106e);
                    }
                } else if (index == k.f2311k6) {
                    this.f2105d = obtainStyledAttributes.getDimension(index, this.f2105d);
                } else if (index == k.f2319l6) {
                    this.f2103b = obtainStyledAttributes.getDimension(index, this.f2103b);
                } else if (index == k.f2327m6) {
                    this.f2104c = obtainStyledAttributes.getDimension(index, this.f2104c);
                } else if (index == k.f2335n6) {
                    this.f2102a = obtainStyledAttributes.getDimension(index, this.f2102a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f10, float f11) {
            if (Float.isNaN(this.f2102a) || f10 >= this.f2102a) {
                if (Float.isNaN(this.f2103b) || f11 >= this.f2103b) {
                    if (Float.isNaN(this.f2104c) || f10 <= this.f2104c) {
                        return Float.isNaN(this.f2105d) || f11 <= this.f2105d;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f2092a = constraintLayout;
        a(context, i10);
    }

    private void a(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        a aVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                char c10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    if (c10 == 2) {
                        aVar = new a(context, xml);
                        this.f2096e.put(aVar.f2098a, aVar);
                        continue;
                    } else if (c10 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                            continue;
                        } else {
                            continue;
                        }
                    } else if (c10 != 4) {
                        continue;
                    } else {
                        b(context, xml);
                        continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.k(context, xmlPullParser);
                this.f2097f.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(g gVar) {
    }

    public void d(int i10, float f10, float f11) {
        e eVar;
        a aVar;
        int b10;
        e eVar2;
        int i11 = this.f2094c;
        if (i11 == i10) {
            if (i10 == -1) {
                aVar = this.f2096e.valueAt(0);
            } else {
                aVar = this.f2096e.get(i11);
            }
            int i12 = this.f2095d;
            if ((i12 == -1 || !aVar.f2099b.get(i12).a(f10, f11)) && this.f2095d != (b10 = aVar.b(f10, f11))) {
                if (b10 == -1) {
                    eVar2 = this.f2093b;
                } else {
                    eVar2 = aVar.f2099b.get(b10).f2107f;
                }
                if (b10 != -1) {
                    int i13 = aVar.f2099b.get(b10).f2106e;
                }
                if (eVar2 == null) {
                    return;
                }
                this.f2095d = b10;
                eVar2.c(this.f2092a);
                return;
            }
            return;
        }
        this.f2094c = i10;
        a aVar2 = this.f2096e.get(i10);
        int b11 = aVar2.b(f10, f11);
        if (b11 == -1) {
            eVar = aVar2.f2101d;
        } else {
            eVar = aVar2.f2099b.get(b11).f2107f;
        }
        if (b11 != -1) {
            int i14 = aVar2.f2099b.get(b11).f2106e;
        }
        if (eVar == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
            return;
        }
        this.f2095d = b11;
        eVar.c(this.f2092a);
    }
}
