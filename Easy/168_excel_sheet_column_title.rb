# @param {Integer} column_number
# @return {String}
def convert_to_title(column_number)
    letters = ('A'..'Z').to_a
    result = ''
    while column_number>0
        result = letters[(column_number - 1) % 26] + result;
        column_number = (column_number - 1) / 26
    end
    result
end