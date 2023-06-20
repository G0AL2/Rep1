package da;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: DataSource.java */
/* loaded from: classes2.dex */
public interface l extends i {

    /* compiled from: DataSource.java */
    /* loaded from: classes2.dex */
    public interface a {
        l a();
    }

    void close() throws IOException;

    Map<String, List<String>> e();

    long g(p pVar) throws IOException;

    void l(m0 m0Var);

    Uri o();
}
