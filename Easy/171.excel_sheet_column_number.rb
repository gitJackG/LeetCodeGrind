# @param {String} column_title
# @return {Integer}
def title_to_number(column_title)
    result = 0
    column_title.each_char do |c|
        result = result * 26 + (c.ord - 'A'.ord + 1)
    end
    result
end