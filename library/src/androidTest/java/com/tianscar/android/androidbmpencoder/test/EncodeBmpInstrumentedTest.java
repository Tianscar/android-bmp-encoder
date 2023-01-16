package com.tianscar.android.androidbmpencoder.test;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import com.tianscar.android.graphics.BmpEncoder;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class EncodeBmpInstrumentedTest {

    @Test
    public void encodeBmp() {
        Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();
        Bitmap bitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0xFF000000);
        File outFile = new File(context.getExternalCacheDir(), "test.bmp");
        try {
            if (!outFile.exists()) if (!outFile.createNewFile()) return;
            try (FileOutputStream stream = new FileOutputStream(outFile)) {
                System.out.println(BmpEncoder.compress(bitmap, stream));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            bitmap.recycle();
        }
    }

}