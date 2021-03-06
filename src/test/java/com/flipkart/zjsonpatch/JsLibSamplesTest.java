package com.flipkart.zjsonpatch;

import java.io.IOException;
import java.util.Collection;
import org.junit.runners.Parameterized;

/**
 * @author ctranxuan (streamdata.io).
 *
 * These tests comes from JS JSON-Patch libraries (
 * https://github.com/Starcounter-Jack/JSON-Patch/blob/master/test/spec/json-patch-tests/tests.json
 * https://github.com/cujojs/jiff/blob/master/test/json-patch-tests/tests.json)
 */
public class JsLibSamplesTest extends AbstractTest {

    @Parameterized.Parameters
    public static Collection<PatchTestCase> data() throws IOException {
        return PatchTestCase.load("js-libs-samples");
    }
}
