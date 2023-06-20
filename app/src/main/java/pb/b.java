package pb;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import rb.a;

/* compiled from: AbtExperimentInfo.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f35710g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    static final DateFormat f35711h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    private final String f35712a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35713b;

    /* renamed from: c  reason: collision with root package name */
    private final String f35714c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f35715d;

    /* renamed from: e  reason: collision with root package name */
    private final long f35716e;

    /* renamed from: f  reason: collision with root package name */
    private final long f35717f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f35712a = str;
        this.f35713b = str2;
        this.f35714c = str3;
        this.f35715d = date;
        this.f35716e = j10;
        this.f35717f = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(Map<String, String> map) throws a {
        e(map);
        try {
            return new b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f35711h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    private static void e(Map<String, String> map) throws a {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : f35710g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f35712a;
    }

    long c() {
        return this.f35715d.getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a.c d(String str) {
        a.c cVar = new a.c();
        cVar.f36544a = str;
        cVar.f36556m = c();
        cVar.f36545b = this.f35712a;
        cVar.f36546c = this.f35713b;
        cVar.f36547d = TextUtils.isEmpty(this.f35714c) ? null : this.f35714c;
        cVar.f36548e = this.f35716e;
        cVar.f36553j = this.f35717f;
        return cVar;
    }
}
