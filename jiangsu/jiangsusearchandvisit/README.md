# 江苏电信搜索数据接收
该程序是运行在江苏电信平台，负责将search和visit数据发送到kafka。（kafka数据输出方案暂未定）
写回的kafka topic：kafka2kv

**search和visit**: 具体方案暂定

## 注意事项

* 当search和visit数据的匹配规则需要修改，需要将程序中对应的匹配规则数组进行更新，重新构建最新的jar发送到电信方，更新最新jar包

如有变动需要将spark程序重新启动
