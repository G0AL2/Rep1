package ms.bd.o.Pgl;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class pblw implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f34564a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pblw(pblv pblvVar, String str) {
        this.f34564a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith(this.f34564a);
    }
}
