package reversetemplate

import (
	"fmt"
	"testing"

	"github.com/stretchr/testify/require"
)

func TestParse(t *testing.T) {
	tpl := `
	截至昨日最后一笔交易，您的额度和积分信息如下：{{}}可用额度{{}}积分余额{{gjson date}}您的消费明细如下：{{loop $index}}{{gjson "items.$index.time"}}CNY{{gjson "items.$index.money"}}尾号{{gjson "items.$index.carNumberExt"}}消费{{gjson "items.$index.payCopony"}}{{end}}
	`
	revTpl := Parse(tpl)
	_ = revTpl
}

func TestExecute(t *testing.T) {
	tpl := `
	截至昨日最后一笔交易，您的额度和积分信息如下：{{}}可用额度{{}}积分余额{{gjson date}}您的消费明细如下：{{loop $index}}{{gjson "items.$index.time"}}CNY{{gjson "items.$index.money"}}尾号{{gjson "items.$index.carNumberExt"}}消费{{gjson "items.$index.payCopony"}}~{{end}}
	`
	revTpl := Parse(tpl)
	data := `截至昨日最后一笔交易，您的额度和积分信息如下：￥52,701.28 5,698 可用额度 积分余额    2023/03/10 您的消费明细如下：10:15:06CNY 9.99尾号0626 消费 支付宝-盐城市玥曼文化传媒有限公司~11:02:53CNY 7.23尾号0626 消费 支付宝-Yuansfer,Inc.~ `
	out, err := revTpl.Execute([]byte(data))
	require.NoError(t, err)
	s := string(out)
	fmt.Println(s)
}
