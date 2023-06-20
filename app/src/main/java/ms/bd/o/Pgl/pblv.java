package ms.bd.o.Pgl;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import ms.bd.o.Pgl.pblu;

/* loaded from: classes3.dex */
public class pblv {

    /* renamed from: a  reason: collision with root package name */
    protected final Set<String> f34556a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    protected final pblu.pblb f34557b;

    /* renamed from: c  reason: collision with root package name */
    protected final pblu.pgla f34558c;

    /* loaded from: classes3.dex */
    class pgla implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f34559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34560b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34561c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ pblu.pblc f34562d;

        pgla(Context context, String str, String str2, pblu.pblc pblcVar) {
            this.f34559a = context;
            this.f34560b = str;
            this.f34561c = str2;
            this.f34562d = pblcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                pblv.this.b(this.f34559a, this.f34560b, this.f34561c);
                this.f34562d.a();
            } catch (UnsatisfiedLinkError | pblt e10) {
                this.f34562d.a(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pblv(pblu.pblb pblbVar, pblu.pgla pglaVar) {
        this.f34557b = pblbVar;
        this.f34558c = pglaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r5.length > 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.content.Context r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.pblv.b(android.content.Context, java.lang.String, java.lang.String):void");
    }

    protected File a(Context context) {
        return context.getDir("lib", 0);
    }

    protected File a(Context context, String str, String str2) {
        String a10 = ((pblx) this.f34557b).a(str);
        if (pblu.a(str2)) {
            return new File(a(context), a10);
        }
        File a11 = a(context);
        return new File(a11, a10 + "." + str2);
    }

    public void a(Context context, String str, String str2, pblu.pblc pblcVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (pblu.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        String.format(Locale.US, "Beginning load of %s...", str);
        if (pblcVar == null) {
            b(context, str, str2);
        } else {
            new Thread(new pgla(context, str, str2, pblcVar)).start();
        }
    }
}
