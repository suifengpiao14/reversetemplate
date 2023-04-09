# Reversetemplate 模板反向工程
```go
{}
{loop $index <= data} {gjson "prefix${index}ext"} {end}
{gjson path}
```

text := `截至昨日最后一笔交易，您的额度和积分信息如下：￥52,701.28 5,698 可用额度 积分余额    2023/03/10 您的消费明细如下：10:15:06CNY 9.99尾号0626 消费 支付宝-盐城市玥曼文化传媒有限公司11:02:53CNY 7.23尾号0626 消费 支付宝-Yuansfer,Inc.`
tpl := `截至昨日最后一笔交易，您的额度和积分信息如下：{}可用额度{}积分余额{date}您的消费明细如下：{loop $index}{gjson "items.$index.time"}CNY{gjson "items.$index.money"}尾号{gjson "items.$index.carNumberExt"}消费{gjson "items.$index.payCopony"}{end}`