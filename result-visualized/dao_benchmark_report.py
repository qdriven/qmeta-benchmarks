# encoding: utf-8

## pyecharts:
## https://pyecharts.org/#/zh-cn/series_options?id=lines3deffectopts-3d%e7%ba%bf%e6%a0%b7%e5%bc%8f%e9%85%8d%e7%bd%ae%e9%a1%b9

from pyecharts.charts import Bar
from pyecharts import options as opts
from pyecharts.render import make_snapshot
from snapshot_phantomjs import snapshot

dao_xaxis = ["ADD",
             "UPDATE",
             "QUERY_BY_ID",
             "PAGE_QUERY",
             "CUSTOM_QUERY",
             ]
categories = ["jpa", "mybatisplus"]
tps_data_index = 5


def load_benchmark_data() -> dict:
    result = {}
    for category in categories:
        with open("./dao/" + category + ".csv", 'r', encoding='utf-8') as f:
            lines = f.readlines()
        tps_data = []
        for line in lines:
            parsed_data = line.split(",")
            tps_data.append(parsed_data[tps_data_index])
        result[category] = tps_data

    return result


def render_to_bar_chart(chart_file_name):
    bar = Bar()
    bar.add_xaxis(dao_xaxis)
    datasets = load_benchmark_data()
    for k, v in datasets.items():
        bar.add_yaxis(k, v)
    # bar.set_global_opts(title_opts=opts.TitleOpts(title="DAO framework Comparison Result(Database=H2)"))
    bar.render(chart_file_name)
    # make_snapshot(snapshot, bar.render(), chart_file_name)


if __name__ == '__main__':
    render_to_bar_chart("dao-h2.html")
