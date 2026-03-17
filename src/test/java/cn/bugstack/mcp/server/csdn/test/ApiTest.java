package cn.bugstack.mcp.server.csdn.test;

import cn.bugstack.mcp.server.csdn.infrastructure.gateway.ICSDNService;
import cn.bugstack.mcp.server.csdn.infrastructure.gateway.dto.SaveArticleRequestDTO;
import cn.bugstack.mcp.server.csdn.infrastructure.gateway.dto.SaveArticleResponseDTO;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootTest
public class ApiTest {

    private final Logger log = LoggerFactory.getLogger(ApiTest.class);

    @Autowired
    private ICSDNService csdnService;

    @Test
    public void test_saveArticle() throws IOException {
        SaveArticleRequestDTO requestDTO = SaveArticleRequestDTO.builder()
                .title("ZLibrary反爬机制实战分析的技术文章大纲")
                .description("")
                .content("<h3>爬虫对抗：ZLibrary反爬机制实战分析的技术文章大纲</h3>\n\n<h4>技术背景与目标</h4>\n\n<ul>\n\t<li>爬虫与反爬虫的基本概念</li>\n\t<li>ZLibrary作为典型案例的价值分析</li>\n\t<li>研究目标与预期成果</li>\n</ul>\n\n<h4>ZLibrary反爬机制概览</h4>\n\n<ul>\n\t<li>常见反爬手段分类（IP封锁、验证码、请求频率限制等）</li>\n\t<li>ZLibrary采用的主要反爬技术</li>\n\t<li>反爬机制对用户体验和爬虫效率的影响</li>\n</ul>\n\n<h4>动态请求与参数加密分析</h4>\n\n<ul>\n\t<li>页面加载过程中的动态请求分析</li>\n\t<li>关键请求参数的加密与解密方法</li>\n\t<li>如何模拟合法请求绕过检测</li>\n</ul>\n\n<h4>验证码系统破解方案</h4>\n\n<ul>\n\t<li>ZLibrary验证码类型识别（文字、图形、滑动等）</li>\n\t<li>验证码自动识别技术（OCR、机器学习模型）</li>\n\t<li>验证码绕过策略与效率评估</li>\n</ul>\n\n<h4>IP封锁与请求频率对抗</h4>\n\n<ul>\n\t<li>ZLibrary的IP封锁策略分析</li>\n\t<li>代理IP池的构建与维护</li>\n\t<li>请求间隔动态调整算法</li>\n</ul>\n\n<h4>用户行为模拟技术</h4>\n\n<ul>\n\t<li>鼠标轨迹与点击行为模拟</li>\n\t<li>页面停留时间随机化处理</li>\n\t<li>请求头与设备指纹伪造</li>\n</ul>\n\n<h4>数据解析与存储优化</h4>\n\n<ul>\n\t<li>动态加载内容的解析方法</li>\n\t<li>反序列化异常数据处理</li>\n\t<li>分布式存储与去重策略</li>\n</ul>\n\n<h4>法律与伦理边界探讨</h4>\n\n<ul>\n\t<li>网络爬虫的法律风险提示</li>\n\t<li>数据获取的合理使用范围</li>\n\t<li>反爬对抗的伦理考量</li>\n</ul>\n\n<h4>未来反爬趋势预测</h4>\n\n<ul>\n\t<li>AI在反爬领域的应用前景</li>\n\t<li>生物特征验证技术的潜在影响</li>\n\t<li>爬虫技术的适应性发展方向</li>\n</ul>\n\n<h4>参考资料与工具推荐</h4>\n\n<ul>\n\t<li>相关技术文献与论文</li>\n\t<li>开源爬虫框架对比</li>\n\t<li>常用调试工具与代理服务</li>\n</ul>\n")
                .tags("python")
                .categories("")
                .type("original")
                .status(0)
                .read_type("public")
                .creation_statement(0)
                .reason("")
                .original_link("")
                .authorized_status(false)
                .check_original(false)
                .source("pc_postedit")
                .not_auto_saved(1)
                .creator_activity_id("")
                .cover_images(new ArrayList<>())
                .cover_type(1)
                .vote_id(0)
                .resource_id("")
                .scheduled_time(0)
                .markdowncontent("")
                .resource_url("")
                .editor_type(0)
                .plan(new ArrayList<>())
                .level("0")
                .is_new(1)
                .sync_git_code(0)
                .build();

        String cookie = "uuid_tt_dd=10_9753606990-1753161225432-493733; fid=20_47061416418-1753161224523-644261; c_dl_prid=-; c_dl_rid=1755172486677_641432; c_dl_fref=https://so.csdn.net/so/search; c_dl_fpage=/download/qq_39132095/12051469; c_dl_um=distribute.pc_search_result.none-task-blog-2%7Eall%7Esobaiduend%7Edefault-1-141476098-null-null.142%5Ev102%5Epc_search_result_base3; c_ins_fpage=/index.html; c_ins_um=-; ins_first_time=1761731455538; c_ins_prid=1761731454371_644131; c_ins_rid=1761731458760_103405; c_ins_fref=https://blog.csdn.net/qq_32892383/article/details/143170942; __gads=ID=4fb1afa4f95f7fdb:T=1753259175:RT=1767595066:S=ALNI_MbnFD6DjPRWg-fBCpipE5GAnEht7w; __gpi=UID=0000116c84521906:T=1753259175:RT=1767595066:S=ALNI_MZFFoNyOBU-5Q2-fH-UQjene_K7gw; p_uid=U010000; UserName=2501_90125561; UserInfo=83846208277e43ddae8e172c9db72080; UserToken=83846208277e43ddae8e172c9db72080; UserNick=2501_90125561; AU=028; UN=2501_90125561; BT=1772268810638; csdn_newcert_2501_90125561=1; _clck=14062ti%5E2%5Eg41%5E0%5E2029; c_first_ref=cn.bing.com; c_first_page=https%3A//www.csdn.net/; c_segment=5; Hm_lvt_6bcd52f51e9b3dce32bec4a3997715ac=1772262779,1773735613; HMACCOUNT=D8E626F3F75C72C5; c_ab_test=1; dc_sid=3c541b2303d3e0b00a444c0f80d4fb9d; creative_btn_mp=3; dc_session_id=10_1773753633355.470350; c_dsid=11_1773753633087.488684; SESSION=0cdfefd8-0eb8-4327-913b-59b0dea4493b; log_Id_view=157; c_pref=https%3A//mp.csdn.net/mp_blog/creation/success/159174230; c_ref=https%3A//mp.csdn.net/; c_page_id=default; Hm_lpvt_6bcd52f51e9b3dce32bec4a3997715ac=1773754260; log_Id_pv=22; log_Id_click=13; dc_tos=tc1pjr";
        Response<SaveArticleResponseDTO> response = csdnService.saveArticle(cookie, requestDTO).execute();
        System.out.println("========== 测试结果 code: " + response.code() + " ==========");
        log.info("测试结果 code: {}", response.code());
        if (response.isSuccessful()) {
            System.out.println("========== 测试结果 body: " + JSON.toJSONString(response.body()) + " ==========");
            log.info("测试结果 body: {}", JSON.toJSONString(response.body()));
        } else {
            String errorMsg = response.errorBody() != null ? response.errorBody().string() : "无错误信息";
            System.out.println("========== 测试失败，HTTP状态码: " + response.code() + ", 错误信息: " + errorMsg + " ==========");
            log.error("测试失败，HTTP状态码: {}, 错误信息: {}", response.code(), errorMsg);
        }
    }
}
